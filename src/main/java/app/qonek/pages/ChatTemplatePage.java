package app.qonek.pages;

import app.qonek.base.WebPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;

public class ChatTemplatePage  extends WebPageObject {

    public boolean isButtonCreateNewTemplateDisplayed(){
        return isDisplayed(By.xpath("//p[contains(text(),'Create New Template')]"));
    }
    public void clickCreateNewTemplate(){
        click(By.xpath("//p[contains(text(),'Create New Template')]"));
    }

    public boolean isPopUpCreateNewChatTemplateDisplayed(){
        return isDisplayed(By.cssSelector(".BroadcastChatTemplate"));
    }

    public boolean isEditorialTemplateDisplayed(){
        return isDisplayed(By.cssSelector(".leftModalAddNewTemplate"));

    }

    public boolean isPreviewTemplateDisplayed(){
        return isDisplayed(By.cssSelector(".ContainerPreviewAddNewTemplate"));
    }

    public boolean isInputTemplateNameDisplayed(){
        return isDisplayed(By.id("addnewtemplatechat_textinput_templatename"));
    }

    public void inputTemplateName(String name) {
        type(By.id("addnewtemplatechat_textinput_templatename"), name);
    }

    public String getTemplateNameText(){
        return getAttribute(By.id("addnewtemplatechat_textinput_templatename"), "value");
    }

    public boolean isButtonLoadExistingDisplayed(){
        return isDisplayed(By.id("addnewtemplatechat_btn_loadexisting"));
    }

    public boolean isButtonAddBubleChatDisplayed(){
        return isDisplayed(By.id("addnewtemplate_buble_btn_addbublechat"));
    }

    public boolean isButtonWaitForSecondDisplayed(){
        return isDisplayed(By.id("addnewtemplate_buble_btn_waitforrespond"));
    }

    public boolean isButtonCreateTemplateDisplayed(){
        return isDisplayed(By.id("addnewtemplate_buble_btn_createtemplate"));
    }

    public void inputOnBubbleText(String text){
        click(By.id("bublechat_reusable_quillinput_addnewtemplate_buble_btn_1"));
        keyPress(text);
//        type(By.id("bublechat_reusable_quillinput_addnewtemplate_buble_btn_1"), text);
    }

    public String getInputBubleText(){
        return getText(By.xpath("//div[@data-placeholder='Input Chat Text']/div"));
    }

    public String getPreviewBubleText(){
        return getText(By.xpath("//p[@class='text']//div"));
    }

    public void clickButtonAddBubbleChatBtn(){
        click(By.id("addnewtemplate_buble_btn_addbublechat"));
    }

    public int getInputBubbleTextCount(){
        return findElements(By.cssSelector(".ContainerBuble")).size();
    }

    public void clickButtonAddFile(int formNumber){
        click(By.xpath("(//img[@src='/assets/icons/paperclip-2.svg'])["+formNumber+"]"));
    }

    public void addImageData(){
        String filePath = System.getProperty("user.dir") + File.separator + "gambar" + File.separator + "brz_038.jpg";
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.getElementById('inputFileImage').style.display='block';");
//        js.executeScript("document.getElementById('inputFileImage').value='" + filePath.replace("\\", "\\\\") + "';");
        type(By.id("inputFileImage"), filePath);
    }

    public boolean isImageAttachmentOnEditorialFormDisplayed(){
        return isDisplayed(By.id("bublechat_reusable_image_addnewtemplate_buble_btn_3"));
    }

    public boolean isImageAttachmentOnPreviewDisplayed(){
        return isDisplayed(By.xpath("//div[@class='ChatContent_User']//img[contains(@src, 'data')]"));
    }



}
