# hotel-kite-with-java
Tugas bloking membuat aplikasi crud sederhana bertema aplikasi management hotel dengan menggunakan java netbeans

Aplikasi Ini dapat melakukan ligin multi user, sebagai manager atau staff. Jika kita login sebagai manager maka akan diarahkan kehalaman dashboard admin, dimana pada dashboard tersebut kita dapat melakukan manipulasi data atau CRUD(Create, Read, Update, Delete) Data yang terdapat di database. data yang tersedia pada aplikasi ini ada 2, yaitu data user dan ruangan.
<br>
<br>
Berikut adalah struktur data base yang digunakan:
<br>
db: hotel-pp
       <br>&emsp&emsp |____ tabel: users
      <br>&emsp&emsp  |           |__________ column: id_users(INT[11], PK, AI), username(VARCHAR[50]), password(VARCHAR[50]), levels(VARCHAR[50])
      <br> &emsp&emsp |
      <br> &emsp&emsp |____ tabel: rooms
      <br> &emsp&emsp              |_________ column: id(INT[11], PK, AI), no_kamar(INT[11]), kelas(VARCHAR[50]), status(VARCHAR[50]), visitor(VARCHAR[50], NULL)
