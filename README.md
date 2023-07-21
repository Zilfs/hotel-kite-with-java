# hotel-kite-with-java
Tugas bloking membuat aplikasi crud sederhana bertema aplikasi management hotel dengan menggunakan java netbeans

Aplikasi Ini dapat melakukan ligin multi user, sebagai manager atau staff. Jika kita login sebagai manager maka akan diarahkan kehalaman dashboard admin, dimana pada dashboard tersebut kita dapat melakukan manipulasi data atau CRUD(Create, Read, Update, Delete) Data yang terdapat di database. data yang tersedia pada aplikasi ini ada 2, yaitu data user dan ruangan. Dan jika kita login sebagai staff maka akan diarahkan ke halaman dashboard staff untuk melakukan reservasi kamar
<br>
<br>Data base yang digunakan :
<br>
<br>db:hotel-pp
<br>tabel:users(id_user INT[11] PK AI, username VARCHAR[50], password VARCHARP[50], levels VARCHAR[50])
<br>tabel:rooms(is INT[11] AI PK, no_kamar INT[11], kelas VARCHAR[50], status VARCHAR[50], visitor VARCHAR[50] NULL)
