"# Modul-1-Coding-Standards" 

Refki Septian
2406397196

## Reflection 1

Saya menyadari betapa pentingnya clean code untuk kerja sama tim, terutama ketika fitur - fitur kita bergantung dengan orang lain. Mulai dari penamaan variable, sampai ke alur kode sebisa mungkin dibuat sejelas mungkin. Kemudian saya menemukan betapa pentingnya pemahaman github supaya tidak terjadi bentrok antar tim, sebenarnya komunikasi adalah hal yang utama untuk menyelesaikan masalah ketika ada conflict. Oleh karena saya melihat ketika kita terjun ke dunia industri, kerja sama merupakan skill yang sangat dibutuhkan, bukan seseorang yang serba bisa tetapi seseorang yang bisa merangkul semua pihak untuk serba bisa.

## Reflection 2

Bug yang dihasilkan dari kode yang saya buat tidak bisa saya temukan semuanya, ada banyak sekali bug tidak terduga yang bahkan saya tidak tahu kalau ada bug tersebut. Maka dari itu code coverage tidak menjamin bahwa kode yang telah saya buat benar, melainkan hanya untuk memastikan bahwa ketika user memasukkan input atau berperilaku sesuai dengan dugaan saya maka kode saya akan berfungsi dengan baik. 

Functional test yang baru tersebut akan membuat saya menjadi lebih tenang lagi karena sudah dipastikan jika ada user yang menginputkan data maka datanya akan benar benar masuk. Test yang baru tidak akan berpengaruh dengan test yang sudah ada, tetapi kenapa tidak langsung memeriksa jumlah items sekaligus supaya dapat langsung mengeceknya.

## Reflection 3

1. Selama exercise, saya memperbaiki beberapa code quality issue yang terdeteksi oleh SonarCloud, khususnya yang berkaitan dengan konsistensi struktur project dan maintainability. Contoh issue yang saya perbaiki adalah ketidaksesuaian penamaan package dengan struktur folder, penggunaan field injection @Autowired yang disarankan diganti menjadi constructor injection, deklarasi throws Exception pada unit/functional test yang sebenarnya tidak dibutuhkan, serta duplikasi literal string seperti "redirect:/product/list" yang sebaiknya diekstrak menjadi konstanta agar tidak rawan typo dan lebih mudah dirawat. Selain itu, saya juga merapikan pengelompokan dependencies di Gradle agar sesuai scope (implementation, annotationProcessor, testImplementation, dll) sehingga lebih readable.

Strategi saya adalah membaca setiap issue SonarCloud, memahami alasan teknis mengapa hal tersebut dianggap code smell (misalnya testability, explicit dependency, konsistensi struktur package), lalu menerapkan perbaikan yang paling idiomatik untuk ekosistem Spring Boot/Java. Saya memprioritaskan perbaikan yang berdampak langsung terhadap maintainability (dependency injection, struktur package, duplikasi string) dan yang berpotensi menyebabkan error lintas platform (casing package/folder yang bisa bermasalah di Linux runner). Setelah perubahan, saya menjalankan test dan pipeline CI untuk memastikan tidak ada regresi dan kualitas kode meningkat.

2. Menurut saya workflow yang saya buat sudah memenuhi definisi Continuous Integration (CI), karena setiap ada perubahan kode (push/PR) pipeline berjalan otomatis untuk melakukan checkout, setup environment, menjalankan unit test, dan build. Ini memastikan perubahan yang masuk selalu tervalidasi secara otomatis dan mengurangi risiko integrasi gagal ketika digabung ke branch utama. Selain itu, CI membuat proses verifikasi lebih konsisten dibanding manual checking karena langkahnya deterministik dan terekam lewat log. Untuk Continuous Deployment (CD), implementasi saya sudah mengarah ke CD karena setiap push ke branch main akan memicu proses deploy otomatis ke platform hosting (Koyeb).