Feature: Chat Template - Create New Chat Template

  Background:
    Given User sudah login
    And User berada di halaman Chat Template
    And User belum pernah membuat Chat Template sebelumnya dan terdapat button Create New Template
    When User menekan button Create New Template
    Then Menampilkan pop-up Create New Chat Template

  Scenario: User menekan button Create New Template
    Then terbagi menjadi 2 bagian, yaitu bagian Editorial Template dan bagian Preview Template
    And pada bagian Editorial Template terdapat input form Template Name dan button Load Existing Box bubble chat 1 button Add Bubble Chat dan button Wait For Second Input form Template Hotkey
    And pada bagian Preview Template akan menampilkan contoh pesan seperti pada Bubble chat yang telah ditambahkan
    And pada kanan bawah pop-up terdapat button Save Template

  Scenario: User memberi nama template
    When User klik dan mengetikkan "Promo produk" pada form Template Name
    Then Input form Template Name akan aktif dan terisi "Promo produk"

  Scenario: User membuat pesan pada bubble chat 1
    When User klik dan mengetikkan "Promo produk terbaru tahun ini" pada form box Bubble Chat 1
    Then Box bubble chat 1 akan terisi pesan "Promo produk terbaru tahun ini"
    And pada bagian Preview menampilkan bubble chat dengan pesan "Promo produk terbaru tahun ini"


  Scenario: User menambahkan bubble chat baru
    When User klik button Add Bubble Chat
    Then Akan muncul bubble chat baru pada bagian Editorial Template

  Scenario: User membuat pesan pada bubble chat 2
    When User klik button Add Bubble Chat
    Then Akan muncul bubble chat baru pada bagian Editorial Template
    When User klik button Add File pada bubble chat 2
    And tambah image pada bubble chat 2
    Then Image yang dipilih akan ditambahkan pada box bubble chat 2
    And pada bagian Preview menampilkan bubble chat 2 dengan pesan Image yang ditambahkan





