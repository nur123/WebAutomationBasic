package app.qonek.stepdefs;

import app.qonek.pages.ChatTemplatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ChatTemplatePageStepDefs {

    ChatTemplatePage chatTemplatePage = new ChatTemplatePage();

    @And("User belum pernah membuat Chat Template sebelumnya dan terdapat button Create New Template")
    public void userBelumPernahMembuatChatTemplateSebelumnyaDanTerdapatButtonCreateNewTemplate() {
        Assertions.assertTrue(chatTemplatePage.isButtonCreateNewTemplateDisplayed());
    }

    @When("User menekan button Create New Template")
    public void userMenekanButtonCreateNewTemplate() {
        chatTemplatePage.clickCreateNewTemplate();
    }

    @Then("Menampilkan pop-up Create New Chat Template")
    public void menampilkanPopUpCreateNewChatTemplate() {
        Assertions.assertTrue(chatTemplatePage.isPopUpCreateNewChatTemplateDisplayed());
    }

    @And("terbagi menjadi 2 bagian, yaitu bagian Editorial Template dan bagian Preview Template")
    public void terbagiMenjadiBagianYaituBagianEditorialTemplateDanBagianPreviewTemplate() {
        Assertions.assertTrue(chatTemplatePage.isEditorialTemplateDisplayed());
        Assertions.assertTrue(chatTemplatePage.isPreviewTemplateDisplayed());
    }

    @And("pada bagian Editorial Template terdapat input form Template Name dan button Load Existing Box bubble chat 1 button Add Bubble Chat dan button Wait For Second Input form Template Hotkey")
    public void padaBagianEditorialTemplateTerdapatInputFormTemplateNameDanButtonLoadExistingBoxBubbleChatButtonAddBubbleChatDanButtonWaitForSecondInputFormTemplateHotkeyDefaultnyaTergenerateOlehSistem() {
        Assertions.assertTrue(chatTemplatePage.isInputTemplateNameDisplayed());
        Assertions.assertTrue(chatTemplatePage.isButtonLoadExistingDisplayed());
        Assertions.assertTrue(chatTemplatePage.isButtonWaitForSecondDisplayed());
        Assertions.assertTrue(chatTemplatePage.isButtonAddBubleChatDisplayed());
    }

    @And("pada bagian Preview Template akan menampilkan contoh pesan seperti pada Bubble chat yang telah ditambahkan")
    public void padaBagianPreviewTemplateAkanMenampilkanContohPesanSepertiPadaBubbleChatYangTelahDitambahkan() {
        Assertions.assertTrue(chatTemplatePage.isPreviewTemplateDisplayed());
    }

    @And("pada kanan bawah pop-up terdapat button Save Template")
    public void padaKananBawahPopUpTerdapatButtonSaveTemplate() {
        Assertions.assertTrue(chatTemplatePage.isButtonCreateTemplateDisplayed());
    }

    @When("User klik dan mengetikkan {string} pada form Template Name")
    public void userKlikDanMengetikkanPromoProdukPadaFormTemplateName(String productName) {
        chatTemplatePage.inputTemplateName(productName);
    }

    @Then("Input form Template Name akan aktif dan terisi {string}")
    public void inputFormTemplateNameAkanAktifDanTerisiPromoProduk(String productName) {
        Assertions.assertEquals(productName, chatTemplatePage.getTemplateNameText());
    }

    @When("User klik dan mengetikkan {string} pada form box Bubble Chat 1")
    public void userKlikDanMengetikkanPadaFormBoxBubbleChat(String text) {
        chatTemplatePage.inputOnBubbleText(text);
    }

    @Then("Box bubble chat 1 akan terisi pesan {string}")
    public void boxBubbleChatAkanTerisiPesan(String text) {
        Assertions.assertEquals(text, chatTemplatePage.getInputBubleText());
    }

    @And("pada bagian Preview menampilkan bubble chat dengan pesan {string}")
    public void padaBagianPreviewMenampilkanBubbleChatDenganPesan(String text) {
        Assertions.assertEquals(text, chatTemplatePage.getPreviewBubleText());
    }

    @When("User klik button Add Bubble Chat")
    public void userKlikButton() {
        chatTemplatePage.clickButtonAddBubbleChatBtn();
    }

    @Then("Akan muncul bubble chat baru pada bagian Editorial Template")
    public void akanMunculBubbleChatBaruPadaBagianEditorialTemplate() {
        Assertions.assertEquals(2, chatTemplatePage.getInputBubbleTextCount());
    }

    @Then("Image yang dipilih akan ditambahkan pada box bubble chat {int}")
    public void imageYangDipilihAkanDitambahkanPadaBoxBubbleChat(int arg0) {
        Assertions.assertTrue(chatTemplatePage.isImageAttachmentOnEditorialFormDisplayed());
    }

    @And("pada bagian Preview menampilkan bubble chat {int} dengan pesan Image yang ditambahkan")
    public void padaBagianPreviewMenampilkanBubbleChatDenganPesanImageYangDitambahkan(int arg0) {
        Assertions.assertTrue(chatTemplatePage.isImageAttachmentOnPreviewDisplayed());
    }

    @When("User klik button Add File pada bubble chat {int}")
    public void userKlikButtonAddFilePadaBubbleChat(int formNumber) {
        chatTemplatePage.clickButtonAddFile(formNumber);
    }

    @And("tambah image pada bubble chat {int}")
    public void tambahImagePadaBubbleChat(int formNumber) {
        chatTemplatePage.addImageData();
    }
}
