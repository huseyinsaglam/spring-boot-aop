# spring-boot-aop
#### Aspect Oriented Programming Nedir? ####
Aspect, uygulamalarımızın cross cutting concern kısımlarını işleyen bir programlama paradigmasıdır ve
paradigmanın çıkış noktası concernlere çözüm üretmektir.
Bu yapının kullanılma motivasyonu, single responsibility ve don’t repeat yourself gibi prensiplere uygun olmasıdır.


#### Cross Cutting Concern Nedir? ####
Concern, uygulamalarımızın belli bölümlerinde core fonksiyonlarımızın dışında yapı ve kurallar dahilinde gerçekleşen
logging, performance, transaction management, security, caching, validation, exception handling
gibi sınıflandırdığımız çatıların her biridir.
Cross cutting concern denmesinin sebebi uygulamızın istenilen yerlerinde kullanılması ve kullanılırken o bölgeden soyutlanmış yapılar olmasıdır.

Örnekler
Logging → Servisimize gelen request ve response’ların loglanması.
Transaction Management → Ödemenin alınmasından itibaren çalışan kod döngüsünde oluşacan hata sonrası iade işleminin gerçekleştirilmesi.
Performance → Metodların çalışma sürelerinin hesaplanması.
Validation → Atılacak e-mail öncesi kullanıcı e-mail izin kontrolü.

Faydaları nelerdir?
- Uygulamamızın daha esnek olması ve yönetimi kolaylığı,
- Tekrar eden kod düzeninden kurtulma,
- Daha temiz ve anlaşılabilir bir kod,
- Core logic ve concernlerin birbirinden ayrılması.


Advice Tipleri
- @Aspect : Aspect Oriented Kullanılacak class ın üzerine konulur.
- @EnableAspectJAutoProxy(proxyTargetClass = true) : Application main sınıfında Aspect ozelligi kazandırır
- @Before: Method devreye girmeden önce çalışır.
- @AfterReturning: Method başarılı sonuçlandıktan sonra çalışır.
- @AfterThrowing: Methodun exception dönmesi durumunda çalışır.
- @After: Returning ve Throwing her iki durumdada çalışır. (finally)
- @Around: Method devreye girmeden önce ve metod bittikten sonra çalışır.


Pointcut İfadeleri
Pointcut (kesim noktası) aspectimiz ile neyin eşleşmesi gerektiğini belirler.
