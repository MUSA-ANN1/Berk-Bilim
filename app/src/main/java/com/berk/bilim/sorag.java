package com.berk.bilim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sorag extends AppCompatActivity {
    public static int Alar = 0;
    public static int Blar = 0;
    public static int Clar = 0;
    public static int Dlar = 0;
    public static int Elar = 0;
    public static int Flar = 0;
    public static int Glar = 0;
    public static int Hlar = 0;
    public static int Ilar = 0;
    public static int Jlar = 0;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public static String[][] Soraglar = {
        {"1) Bir ekin meýdanynyň ýanyndan geçeniňizde içindäki ösümliklere aýratyn üns bermek.", "2) Bozulan elektroniki enjamlary bejermek.", "3) Maslahatçy bir adam bolmak.", "4) Müzeýleri gezmek.", "5) Kitap okamak.", "6) Häzirki zaman ýaşaýşyň meseleleri barada gözleg geçirmek.", "7) Halkara konferensiýa gatnaşmak.", "8) Ynsan bedeniniň gurluşy bilen gyzyklanmak.", "9) 'Baýamaklyk barada' kitaplary okamak.", "10) Matematiki hasaplamalar bilen gyzyklanmak."},
        {"11) Maldarçylyk bilen gyzyklanmak.", "12) Zergärçilik sergilerini gezmek.", "13) Görýän gyzykly kinofilmiň netijesini çaklamak.", "14) Dürli kolleksiýalar ýygnamak.", "15) Gazetlerdäki oýlanmalary okamak.", "16) TV-de alyp baryjy bolmak (tamada).", "17) Daşary ýurt dilinden kitap terjime etmek.", "18) Saglyk öýlerinde işlemek.", "19) Pullary daşary ýurt pullaryna öwürmek.", "20) Kompýuterde ýörite programmalar taýýarlamak."},
        {"21) Gök önüm we miwe ýetişdirmek.", "22) Öýdäki köne mebelleri bejermek.", "23) Beýik adamlaryň ömür-döredijiligini okamak.", "24) Antika (gadymy) zatlar bilen gyzyklanmak.", "25) Meşhur şahyrlaryň (iň bolmanda biriniň) bütin eserlerini okamak.", "26) Ynsany herekete geçirýän sebäpleri öwrenmek.", "27) Turistler bilen gepleşmäge çalyşmak.", "28) Näsag adamlara kömek etmek.", "29) Bahalardaky ösüş we peselişleriň sebäplerini düşünmek.", "30) Matematiki hasaplamalar bilen krosswordlar çözmek."},
        {"31) Ýabany haýwanlaryň suratlaryny toplamak.", "32) Bir binanyň gurluşynyň aýratynlyklaryny öwrenmek.", "33) Bir haýyr-sahabat üçin pul toplamak.", "34) Orkestra sazlary we klassiki sazlary diňlemekden lezzet almak.", "35) Halkyň däp-dessurlarynyň we ynançlarynyň sebäplerini öwrenmek.", "36) Ynsanlardaky psihologiki meseleleriň (problemalary) sebäplerini öwrenmek.", "37) Täze eşiden bir sözüň üçin sözlüge seretmek.", "38) Berilen dermanlaryň gabyndaky ýazgylary (prospektura) okamak.", "39) Ekonomiýa žurnallaryny okamak.", "40) Öýleriň ýa-da şuňa meňzeş gurluşyklaryň proýektlerini çyzmak."},
        {"41) Häzirki zaman ekerançylygynda dolandyrmak usullary barada ýazgylar okamak.", "42) Owadan surat çekmek.", "43) Okuw jaýlaryny saýlanlarynda dostlaryňa ýol (maslahat) görkezmek.", "44) Öýkünmek.", "45) TV-lerdäki edebiýat we sungat programmalara seretmek.", "46) Gazetlerdäki sorag-jogap şeklindäki ýazgylary okamak.", "47) Daşary ýurtlar bilen gyzyklanmak.", "48) Laboratoriýada tejribe geçirmek.", "49) Birža bilen gyzyklanmak.", "50) Bir edaranyň buhgalteriýasyny ýöretmek."},
        {"51) Tokaýa dynç almaga gitmek.", "52) Netijesiniň gowy bolmajakdygyny bilseň hem, soňuna çenli sabretmek.", "53) Döwletiň syýasaty bilen gyzyklanmak.", "54) Sungat galeriýalaryny gezmek.", "55) Taryhy wakalar we kişiler barada maglumat toplamak.", "56) Guramalarda, haýyr-sahabat ýaly işlerde işlemek.", "57) Dil öwrenmegiň praktiki usullaryny öwrenmek.", "58) Agyr ýatan näsaga seretmek, onuň bilen gyzyklanmak.", "59) Pulyň hümmetindäki üýtgeşmeleri yzarlamak.", "60) Bilim, tehnologiki žurnallary okamak."},
        {"61) Başga döwletleriň yklymy (klimaty) bilen gyzyklanmak.", "62) Çagalara ýönekeý oýunjaklar ýasap bermek.", "63) TV-de göniýaýlymdaky gepleşikleri görmek.", "64) El-işleri sergilenýän ýerleri gezmek.", "65) Radiýo ýa-da TV-den gündelik habarlary yzarlamak.", "66) Adamlary jenaýata iten sebäpler barada gözleg geçirmek.", "67) Turist toparlaryny gezdirmek.", "68) Saglyk baradaky täzelikleri yzarlamak.", "69) Mahabatlary (reklama) görmek.", "70) Tapyndylar we oýlap tapyşlar bilen gyzyklanmak."},
        {"71) Deňziň düýbi we suwlar barada gözleg geçirmek.", "72) Haly we dokma önümleri magazinleriniň vitrinalaryna seretmek.", "73) Bir adama edilen haksyzlyga garşy bolmak.", "74) Gezelençlerde fotoapparaty daşamak.", "75) Wakalaryň sebäpleri we netijeleri barada bilesigelijilik etmek.", "76) Tussaghanadaky bir tanysy görmäge gitmek.", "77) Güçli bir ýatkeşlige eýe bolmak.", "78) Keselhanada ýatan ýakynlaryňy tiz-tizden görmäge gitmek.", "79) Adamlara täsir etmäniň ýollaryny öwrenmek.", "80) Radio we TV-iň nähili işleýändigini öwrenmek."},
        {"81) Güllerin dürli görnüşlerine gyzyklanma bildirmek.", "82) Öýdäki goşlaryň ýerleşdirilmeginde pikiriňi beýan etmek.", "83) Özara gepleşiklerdäki gabat gelýän jedelleşmelere gatnaşmak.", "84) Güýmenje (karikatura) žurnallaryny okamak.", "85) Dürli milletleriň jemgyýet taýdan gurluşyny öwrenmek.", "86) Gündelik gazetlerden iň bolmanda birini okamak.", "87) Türkmen dili dersinde we grammatikasynda başarjaň bolmak.", "88) Bir näsagyň operasiýasyny görmek.", "89) Çöken bir firmany aýaga galdyrmaga synanyşmak.", "90) Tapawutly bir ýangyç bilen işläýjek awtoulag oýlap tapmak we kämilleşdirmek."},
        {"91) Ýagşyň haçan ýagjakdygyny öňünden çaklamak.", "92) Mebeller sergisini gezmek.", "93) Toparlaýyn çykyşlara (aýdym, oýun) gatnaşmak.", "94) Saz gurallaryndan birini (dutar, tüýdük we ş.m.) çalyp bilmek.", "95) Söz sözlemek we boýun etmek ukybyna eýe bolmak.", "96) Kiosklaryň ýanyndan geçeniňizde gazetlerdäki suratlara seretmek.", "97) Dürli dillerdäki meňzeş sözleri tapmaga synanyşmak.", "98) Ynsan we haýwan öýjüklerinde gözleg geçirmek.", "99) Satyn almakçy bolýan bir harydyň optom satyş bahasyny öwrenmek.", "100) Astronomiýa degişli kitaplar okamak."},
        {"101) Türkmenistanyň ýerasty baýlyklaryny gözlemek.", "102) Awtoulag markalary (modelleri) bilen gyzyklanmak.", "103) Bir iş ýerinde işgärler bölüminiň başlygy bolmak.", "104) Bahasynyň gymmatlygyna garamazdan lüks bir naharhanada naharlanmak.", "105) Meşhur bir ýazyjy ýa-da şahyr bolmaklygy pikirlenmek.", "106) Ynsan we bütin älemiň nähili emele gelendigini pikirlenmek.", "107) Gazet we žurnallardaky daşarky syýasat ýazgylary okamak.", "108) Bilim müzeýini gezmek.", "109) Bir firmanyň peýda we zyýan hasaplary bilen gyzyklanmak.", "110) Fantastiki filmleri görmek."},
        {"111) Magdanlaryň we nebitiň nädip emele gelýändigini bilen gyzyklanmak.", "112) Modany synlamak.", "113) Ýörite bir tema boýunça maglumat toplamak.", "114) Suwly boýag bilen tebigatyň suratyny çekmek.", "115) Zatlaryň (predmet) we wakalaryň aýratynlyklaryna üns bermek.", "116) Sowda edilende bahany pese düşürmäge synanyşmak.", "117) Pikirleriňi, söz we ýazgy arkaly täsirli aňladyp bilmek.", "118) Mineral suwlaryň we ýerden çykýan gyzgyn suwlaryň peýdalary barada barlag geçirmek.", "119) Bazar ykdysadyýetini goldamak.", "120) Uzak wagt stol başyndan turman işlemeklige sabyr etmek."},
        {"121) Deňiz kenarynda gurnaljak bir gezelenje gatnaşmak.", "122) Matalary nagyşlamak we reňklemek.", "123) Dostlary bilen gatnaşyklarynyň oňat bolmagy.", "124) Palçykdan heýkeller ýasamak.", "125) Bir dersde ýa-da gürrüňdeşlikde temanyň aýratynlyklary barada soraglar soramak.", "126) Hukuk, adalat barada maglumat beren gazeti almak.", "127) Sungata degişli ensiklopediýalary okamak.", "128) Düwnük (rak) keseliniň bejergisi barada gyzyklanmak.", "129) Egin-eşigine üns bermek.", "130) Tehnologiýa täzelikleri bilen gyzyklanmak."},
        {"131) Beýik daglara we depelere dyrmaşmak.", "132) Kitaplary ulanmazdan öň jiltlemek.", "133) Oýunlarda topar ýolbaşçysy bolmak.", "134) Ýaşaýan jaýyň içki gurluşyna we bezegine (dekorasiýa) üns bermek.", "135) Duýgy-pikirleri we gören zatlaryňy çişirip gürrüň bermek.", "136) Mejlise degişli habarlary okamak.", "137) Ýakyn wagtlara degişli dokumentler bilen gyzyklanmak we gözlemek.", "138) Sähra gezelençlerinde şypaly ösümlikleri toplamak.", "139) Güne programmaly başlamak.", "140) Bir işe başlamazdan öň ol işiň planyny taýýarlamak."},
        {"141) Keselli we ýaraly haýwanlara kömek etmek.", "142) El ukyply işlere aýratyn üns bermek.", "143) Köpçüligiň öňünde arkaýyn we täsirli geplemek.", "144) Kinoteatra gitmek.", "145) Dini temalarda bilgili bolmak.", "146) Negrleriň tenleriniň näme üçin garadygy barada gyzyklanmak.", "147) Bir iş ýeriniň adyndan iş görüşmelerine gatnaşmak.", "148) Daşary ýurt dilindäki zatlaryň atlaryny ýatda saklamak.", "149) Görüşmelere, duşuşuklara wagtynda gitmek.", "150) Bilimde formulalaryň nähili kämilleşendigi bilen gyzyklanmak."},
        {"151) Atom elektrik energiýa stansiýalaryna garşy çykmak.", "152) Egirme-dokma stanogynda işlemek.", "153) Bir temada gözleg we barlag geçireniňden soň karar bermek.", "154) Sungat taryhynda aýratyn bir ýeri bolan ybadathanalary gezmek.", "155) Çagalara erteki aýdyp bermek.", "156) Dürli dilleriň we yrklaryň nähili emele gelendigi barada gözleg geçirmek.", "157) Daşary ýurt kinofilmlerine gyzyklanma bildirmek.", "158) Kyn ýagdaýdakylara we çäresizlere kömek etmäge höwesek bolmak.", "159) Ynsan gatnaşyklarynda näzik, sypaýy bolmak.", "160) Ulanýan gurallaryň funksiýalaryny ösdürmek we köpeltmek."}
    };

    public static String[][] Soraglar_en = {
        {"1) Pay special attention to the plants in a field you pass by.", "2) Repair broken electronic devices.", "3) Be a consultant.", "4) Visit museums.", "5) Read books.", "6) Research current lifestyle issues.", "7) Participate in an international conference.", "8) Be interested in the structure of the human body.", "9) Read books about wealth.", "10) Be interested in mathematical calculations."},
        {"11) Be interested in animal husbandry.", "12) Visit jewelry exhibitions.", "13) Predict the outcome of an interesting movie you're watching.", "14) Collect various collections.", "15) Read puzzles in newspapers.", "16) Be a presenter on TV (host).", "17) Translate books from a foreign language.", "18) Work in healthcare facilities.", "19) Exchange money into foreign currencies.", "20) Prepare specialized software on a computer."},
        {"21) Grow vegetables and fruits.", "22) Repair old furniture at home.", "23) Read about the lives and works of great people.", "24) Be interested in antiques.", "25) Read all the works of famous poets (at least one).", "26) Study the reasons that motivate people.", "27) Try to communicate with tourists.", "28) Help sick people.", "29) Analyze the reasons for price increases and decreases.", "30) Solve crosswords involving mathematical calculations."},
        {"31) Collect pictures of wild animals.", "32) Study the unique features of a building's construction.", "33) Raise money for charity.", "34) Enjoy listening to orchestral and classical music.", "35) Study the reasons behind people's traditions and beliefs.", "36) Study the causes of psychological problems in people.", "37) Look up a newly heard word in the dictionary.", "38) Read the instructions on medicine packages.", "39) Read economics magazines.", "40) Draw plans for houses or similar structures."},
        {"41) Read about modern agricultural management methods.", "42) Take beautiful photos.", "43) Advise friends on choosing educational institutions.", "44) Apologize.", "45) Watch literature and art programs on TV.", "46) Read Q&A sections in newspapers.", "47) Be interested in foreign countries.", "48) Conduct experiments in a laboratory.", "49) Be interested in the stock market.", "50) Manage an organization's accounting."},
        {"51) Go to the forest for relaxation.", "52) Be patient even if you know the result won't be good.", "53) Be interested in state politics.", "54) Visit art galleries.", "55) Collect information about historical events and figures.", "56) Work in organizations or charity events.", "57) Study practical methods of learning languages.", "58) Take care of a seriously ill patient.", "59) Track changes in the value of money.", "60) Read science and technology magazines."},
        {"61) Be interested in the climate of other countries.", "62) Make simple toys for children.", "63) Watch live discussions on TV.", "64) Visit handicraft exhibitions.", "65) Follow daily news on radio or TV.", "66) Research the reasons behind crimes.", "67) Guide tourist groups.", "68) Follow health-related news.", "69) Watch advertisements.", "70) Be interested in inventions and innovations."},
        {"71) Research the depths of the sea and water bodies.", "72) Look at the displays in carpet and textile shops.", "73) Stand against injustice done to someone.", "74) Carry a camera during walks.", "75) Discuss the causes and effects of events.", "76) Visit a friend in the hospital.", "77) Have a strong memory.", "78) Frequently visit hospitalized relatives.", "79) Study ways to influence people.", "80) Learn how radio and TV work."},
        {"81) Show interest in different types of flowers.", "82) Express your opinion on the arrangement of rooms at home.", "83) Participate in debates during conversations.", "84) Read cartoon magazines.", "85) Study the social structures of different nations.", "86) Read at least one daily newspaper.", "87) Excel in Turkmen language and grammar classes.", "88) Observe a patient's surgery.", "89) Try to revive a bankrupt company.", "90) Design and improve a car with a unique fuel system."},
        {"91) Predict when it will rain.", "92) Visit furniture exhibitions.", "93) Participate in group performances (songs, plays).", "94) Play a musical instrument (dutar, flute, etc.).", "95) Have the ability to persuade and convince.", "96) Look at pictures in newspapers when passing by kiosks.", "97) Try to find similar words in different languages.", "98) Research human and animal cells.", "99) Learn the wholesale price of a product you want to buy.", "100) Read books on astronomy."},
        {"101) Explore Turkmenistan's underground resources.", "102) Be interested in car models.", "103) Be the head of a department in a workplace.", "104) Dine at a luxurious restaurant regardless of the cost.", "105) Think about becoming a famous writer or poet.", "106) Reflect on how humans and the universe came into existence.", "107) Read foreign policy articles in newspapers and magazines.", "108) Visit a science museum.", "109) Be interested in a company's profit and loss statements.", "110) Watch fantasy movies."},
        {"111) Be interested in how minerals and oil are formed.", "112) Follow fashion trends.", "113) Collect information on a specific topic.", "114) Paint nature with watercolors.", "115) Pay attention to the unique features of objects and events.", "116) Try to negotiate a lower price when trading.", "117) Effectively express thoughts through speech and writing.", "118) Research the benefits of mineral and geothermal waters.", "119) Support the market economy.", "120) Be patient with long hours of desk work."},
        {"121) Participate in a seaside picnic.", "122) Embroider and color patterns.", "123) Maintain good relationships with friends.", "124) Make clay sculptures.", "125) Ask questions about the unique aspects of a topic during a lesson or conversation.", "126) Buy a newspaper that provides legal information.", "127) Read encyclopedias related to art.", "128) Be interested in the treatment of cancer.", "129) Pay attention to clothing.", "130) Be interested in technological innovations."},
        {"131) Climb great mountains and hills.", "132) Cover books before using them.", "133) Be a team leader in games.", "134) Pay attention to the interior design and decoration of your living space.", "135) Express your feelings and thoughts about what you see.", "136) Read news related to parliament.", "137) Be interested in and search for recent documents.", "138) Collect medicinal plants during field trips.", "139) Start the day with a plan.", "140) Prepare a plan before starting a task."},
        {"141) Help sick and injured animals.", "142) Pay special attention to handicrafts.", "143) Speak confidently and effectively in front of a crowd.", "144) Go to the cinema.", "145) Be knowledgeable about religious topics.", "146) Be curious about why the skin of Negroes is black.", "147) Participate in job interviews on behalf of a workplace.", "148) Memorize the names of foreign objects.", "149) Attend meetings and appointments on time.", "150) Be interested in how formulas evolve in science."},
        {"151) Oppose nuclear power plants.", "152) Work on a spinning and weaving machine.", "153) Make a decision after researching a topic.", "154) Visit temples with a special place in art history.", "155) Tell stories to children.", "156) Research how different languages and races originated.", "157) Show interest in foreign films.", "158) Be eager to help those in difficult situations.", "159) Be gentle and kind in human relationships.", "160) Improve and expand the functions of tools used."}
    };

    public static String[][] Soraglar_ru = {
        {"1) Обращать особое внимание на растения, проходя мимо поля.", "2) Ремонтировать сломанные электронные устройства.", "3) Быть консультантом.", "4) Посещать музеи.", "5) Читать книги.", "6) Исследовать проблемы современной жизни.", "7) Участвовать в международных конференциях.", "8) Интересоваться строением человеческого тела.", "9) Читать книги о богатстве.", "10) Интересоваться математическими расчетами."},
        {"11) Интересоваться животноводством.", "12) Посещать выставки ювелирных изделий.", "13) Предсказывать концовку интересного фильма.", "14) Собирать различные коллекции.", "15) Читать газетные головоломки.", "16) Быть ведущим на телевидении.", "17) Переводить книги с иностранного языка.", "18) Работать в медицинских учреждениях.", "19) Обменивать валюту.", "20) Создавать специализированные программы на компьютере."},
        {"21) Выращивать овощи и фрукты.", "22) Ремонтировать старую мебель дома.", "23) Читать о жизни великих людей.", "24) Интересоваться антиквариатом.", "25) Читать все произведения известных поэтов.", "26) Изучать причины, побуждающие людей к действию.", "27) Пытаться общаться с туристами.", "28) Помогать больным людям.", "29) Понимать причины роста и падения цен.", "30) Решать кроссворды с математическими расчетами."},
        {"31) Собирать фотографии диких животных.", "32) Изучать особенности строительства зданий.", "33) Собирать деньги на благотворительность.", "34) Наслаждаться прослушиванием оркестровой и классической музыки.", "35) Изучать причины традиций и верований народа.", "36) Изучать причины психологических проблем у людей.", "37) Искать значение нового слова в словаре.", "38) Читать инструкции на упаковках лекарств.", "39) Читать журналы по экономике.", "40) Рисовать проекты домов или подобных сооружений."},
        {"41) Читать статьи о методах управления в современном сельском хозяйстве.", "42) Делать красивые фотографии.", "43) Давать советы друзьям при выборе учебного заведения.", "44) Жаловаться.", "45) Смотреть литературные и художественные программы на телевидении.", "46) Читать вопросы и ответы в газетах.", "47) Интересоваться зарубежными странами.", "48) Проводить эксперименты в лаборатории.", "49) Интересоваться биржей.", "50) Управлять бухгалтерией учреждения."},
        {"51) Отдыхать в лесу.", "52) Терпеть до конца, даже если результат будет плохим.", "53) Интересоваться государственной политикой.", "54) Посещать художественные галереи.", "55) Собирать информацию об исторических событиях и личностях.", "56) Работать в организациях, занимающихся благотворительностью.", "57) Изучать практические методы изучения языка.", "58) Ухаживать за тяжелобольным пациентом.", "59) Отслеживать изменения в стоимости денег.", "60) Читать научно-технические журналы."},
        {"61) Интересоваться климатом других стран.", "62) Делать простые игрушки для детей.", "63) Смотреть прямые эфиры на телевидении.", "64) Посещать выставки ручных изделий.", "65) Следить за ежедневными новостями по радио или телевидению.", "66) Исследовать причины, ведущие людей к преступлениям.", "67) Водить экскурсии для туристов.", "68) Следить за новостями о здоровье.", "69) Смотреть рекламу.", "70) Интересоваться изобретениями и открытиями."},
        {"71) Исследовать морское дно и воды.", "72) Смотреть витрины магазинов ковров и тканей.", "73) Противостоять несправедливости, совершенной против человека.", "74) Носить с собой фотоаппарат на прогулках.", "75) Обсуждать причины и последствия событий.", "76) Посещать знакомого в больнице.", "77) Иметь хорошую память.", "78) Часто навещать близких в больнице.", "79) Изучать способы влияния на людей.", "80) Изучать, как работают радио и телевидение."},
        {"81) Интересоваться различными видами цветов.", "82) Высказывать свое мнение о расстановке мебели в доме.", "83) Участвовать в спорах во время разговоров.", "84) Читать журналы с карикатурами.", "85) Изучать социальное устройство разных народов.", "86) Читать хотя бы одну ежедневную газету.", "87) Быть успешным в уроках туркменского языка и грамматики.", "88) Наблюдать за операцией пациента.", "89) Пытаться восстановить разорившуюся фирму.", "90) Придумывать и совершенствовать автомобиль с уникальным двигателем."},
        {"91) Предсказывать, когда пойдет дождь.", "92) Посещать выставки мебели.", "93) Участвовать в групповых выступлениях (песни, танцы).", "94) Уметь играть на одном из музыкальных инструментов (дутар, тюйдюк и т.д.).", "95) Иметь способность убеждать и подчинять.", "96) Смотреть на фотографии в газетах, проходя мимо киосков.", "97) Пытаться находить похожие слова на разных языках.", "98) Исследовать клетки человека и животных.", "99) Узнавать оптовую цену товара, который хотите купить.", "100) Читать книги по астрономии."},
        {"101) Исследовать подземные богатства Туркменистана.", "102) Интересоваться марками автомобилей.", "103) Быть начальником отдела кадров на работе.", "104) Обедать в роскошном ресторане, несмотря на высокую цену.", "105) Мечтать стать известным писателем или поэтом.", "106) Размышлять о том, как появились человек и вселенная.", "107) Читать статьи о внешней политике в газетах и журналах.", "108) Посещать музей науки.", "109) Интересоваться прибылью и убытками компании.", "110) Смотреть фантастические фильмы."},
        {"111) Интересоваться тем, как образуются минералы и нефть.", "112) Следить за модой.", "113) Собирать информацию по определенной теме.", "114) Рисовать природу акварелью.", "115) Обращать внимание на особенности предметов и событий.", "116) Пытаться снизить цену при торговле.", "117) Эффективно выражать свои мысли словами и письменно.", "118) Исследовать пользу минеральных и термальных вод.", "119) Поддерживать рыночную экономику.", "120) Терпеливо работать за столом в течение долгого времени."},
        {"121) Участвовать в прогулке по пляжу.", "122) Вышивать и раскрашивать узоры.", "123) Хорошие отношения с друзьями.", "124) Лепить скульптуры из глины.", "125) Задавать вопросы об особенностях темы во время урока или разговора.", "126) Покупать газету с информацией о праве и справедливости.", "127) Читать энциклопедии по искусству.", "128) Интересоваться лечением рака.", "129) Обращать внимание на одежду.", "130) Интересоваться новинками технологий."},
        {"131) Восходить на высокие горы и холмы.", "132) Переплетать книги перед использованием.", "133) Быть лидером команды в играх.", "134) Обращать внимание на внутреннее устройство и декор жилья.", "135) Красочно рассказывать о своих чувствах и увиденном.", "136) Читать новости о собраниях.", "137) Интересоваться и изучать документы, связанные с ближайшим временем.", "138) Собирать лекарственные растения во время прогулок по пустыне.", "139) Начинать день с плана.", "140) Готовить план работы перед началом дела."},
        {"141) Помогать больным и раненым животным.", "142) Обращать особое внимание на ручные работы.", "143) Уверенно и эффективно говорить перед публикой.", "144) Ходить в кинотеатр.", "145) Быть осведомленным в религиозных темах.", "146) Интересоваться, почему у негров темная кожа.", "147) Участвовать в переговорах от имени компании.", "148) Запоминать названия предметов на иностранном языке.", "149) Приходить вовремя на встречи и переговоры.", "150) Интересоваться тем, как совершенствуются формулы в науке."},
        {"151) Выступать против атомных электростанций.", "152) Работать на ткацком станке.", "153) Принимать решение после исследования и анализа темы.", "154) Посещать храмы, имеющие особое место в истории искусства.", "155) Рассказывать сказки детям.", "156) Исследовать, как образовались разные языки и расы.", "157) Интересоваться зарубежными фильмами.", "158) Желать помогать людям в трудных ситуациях.", "159) Быть нежным и добрым в человеческих отношениях.", "160) Улучшать и расширять функции используемых инструментов."}
    };



public static int i = 0;
    public static int j = 0;
    public static TextView textView = null;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Alar", Alar);
        outState.putInt("Blar", Blar);
        outState.putInt("Clar", Clar);
        outState.putInt("Dlar", Dlar);
        outState.putInt("Elar", Elar);
        outState.putInt("Flar", Flar);
        outState.putInt("Glar", Glar);
        outState.putInt("Hlar", Hlar);
        outState.putInt("Ilar", Ilar);
        outState.putInt("Jlar", Jlar);
        outState.putInt("i", i);
        outState.putInt("j", j);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Alar = savedInstanceState.getInt("Alar");
        Blar = savedInstanceState.getInt("Blar");
        Clar = savedInstanceState.getInt("Clar");
        Dlar = savedInstanceState.getInt("Dlar");
        Elar = savedInstanceState.getInt("Elar");
        Flar = savedInstanceState.getInt("Flar");
        Glar = savedInstanceState.getInt("Glar");
        Hlar = savedInstanceState.getInt("Hlar");
        Ilar = savedInstanceState.getInt("Ilar");
        Jlar = savedInstanceState.getInt("Jlar");
        i = savedInstanceState.getInt("i");
        j = savedInstanceState.getInt("j");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorag);
        textView = findViewById(R.id.soraggoy);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        if (MainActivity.tm) {
            textView.setText(Soraglar[0][0]);
            b2.setText(R.string.YOK_tm);
            b1.setText(R.string.HAWA_tm);
        } else if (MainActivity.en) {
            textView.setText(Soraglar_en[0][0]);
            b2.setText(R.string.YOK_en);
            b1.setText(R.string.HAWA_en);
        } else if (MainActivity.ru) {
            textView.setText(Soraglar_ru[0][0]);
            b2.setText(R.string.YOK_ru);
            b1.setText(R.string.HAWA_ru);
        }

        if (savedInstanceState != null) {
            Alar = savedInstanceState.getInt("Alar");
            Blar = savedInstanceState.getInt("Blar");
            Clar = savedInstanceState.getInt("Clar");
            Dlar = savedInstanceState.getInt("Dlar");
            Elar = savedInstanceState.getInt("Elar");
            Flar = savedInstanceState.getInt("Flar");
            Glar = savedInstanceState.getInt("Glar");
            Hlar = savedInstanceState.getInt("Hlar");
            Ilar = savedInstanceState.getInt("Ilar");
            Jlar = savedInstanceState.getInt("Jlar");
            i = savedInstanceState.getInt("i");
            j = savedInstanceState.getInt("j");
        } else {
            Alar = 0;
            Blar = 0;
            Clar = 0;
            Dlar = 0;
            Elar = 0;
            Flar = 0;
            Glar = 0;
            Hlar = 0;
            Ilar = 0;
            Jlar = 0;
            i = 0;
            j = 0;
        }
        textView = findViewById(R.id.soraggoy);

        if (i != 0 || j != 0) {
            if (MainActivity.tm) {
                textView.setText(Soraglar[i][j]);
            } else if (MainActivity.en) {
                textView.setText(Soraglar_en[i][j]);
            } else if (MainActivity.ru) {
                textView.setText(Soraglar_ru[i][j]);
            }
        }
    }

    public void but(View v) {
        Button button = (Button) v;

        if (button.getId() == R.id.button) {
            if (j == 0) {
                Alar = Alar + 1;
            } else if (j == 1) {
                Blar = Blar + 1;
            } else if (j == 2) {
                Clar = Clar + 1;
            } else if (j == 3) {
                Dlar = Dlar + 1;
            } else if (j == 4) {
                Elar = Elar + 1;
            } else if (j == 5) {
                Flar = Flar + 1;
            } else if (j == 6) {
                Glar = Glar + 1;
            } else if (j == 7) {
                Hlar = Hlar + 1;
            } else if (j == 8) {
                Ilar = Ilar + 1;
            } else if (j == 9) {
                Jlar = Jlar + 1;
            }
        }
        j++;


        if (j == 10) {
            j=0;
            i++;

            if (i == 16) {
                Jogap.Alar = Alar;
                Jogap.Blar = Blar;
                Jogap.Clar = Clar;
                Jogap.Dlar = Dlar;
                Jogap.Elar = Elar;
                Jogap.Flar = Flar;
                Jogap.Glar = Glar;
                Jogap.Hlar = Hlar;
                Jogap.Ilar = Ilar;
                Jogap.Jlar = Jlar;
                startActivity(new Intent(sorag.this, Jogap.class));
                finish();
                return;
            }
        }

        if (MainActivity.tm) {
            textView.setText(Soraglar[i][j]);
        } else if (MainActivity.en) {
            textView.setText(Soraglar_en[i][j]);
        } else if (MainActivity.ru) {
            textView.setText(Soraglar_ru[i][j]);
        }
    }
}