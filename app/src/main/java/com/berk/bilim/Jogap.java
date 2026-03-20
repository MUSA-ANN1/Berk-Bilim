package com.berk.bilim;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Jogap extends AppCompatActivity {

    public static String Ajogap = "Oba hojalygy inžinerçiligi, tokaý hojalygy, weterinariýa, daşky gurşaw in Engineeringenerçiligi, balykçylyk, syýahatçylyk, magdançylyk, arheologiýa, sport, meteorologiýa, geografiýa we ş.m.";
    public static String Bjogap = "Dokma engineeringenerçiligi, radio-telewideniýe engineeringenerçiligi, tehniki işgärler, binagär, tehniki ussat, tehniki mugallymlar; Diş tehnigi, mehanik inerener we ş.m.";
    public static String Cjogap = "Hukuk (aklawçy, kazy, prokuror), Syýasy, iş, dolandyryjy we ş.m.";
    public static String Djogap = "Fotosurat, film, teatr, aýdym-saz, surat, heýkeltaraş, binagär, landşaft arhitekturasy, arheolog, sungat taryhy, arheologiýa we ş.m.";
    public static String Ejogap = "Edebiýat mugallymy, žurnalist, mugallym, teolog, jemgyýetçilik gatnaşyklary hünärmeni, mahabat beriji, marketolog, geňeşçi, taryh we ş.m.";
    public static String Fjogap = "Psihologiýa, Sosiologiýa, Filosofiýa, Antropologiýa, Hukuk, Marketing, Döwlet Dolandyryşy, žurnalist, iterazyjy, Jemgyýetçilik gatnaşyklary we ş.m.";
    public static String Gjogap = "Terjime, daşary ýurt dillerini öwretmek, filologiýa, myhmanhanalary dolandyrmak, syýahatçylygy dolandyrmak, halkara gatnaşyklary we ş.m.";
    public static String Hjogap = "Biolog, lukman, farmasewt, diş lukmany, şepagat uýasy, weterinar, himik we ş.m.";
    public static String Ijogap = "Ykdysatçy, bankir, söwdagär, hazynaçy, hökümet dolandyryjysy, ykdysatçy, buhgalter we ş.m.";
    public static String Jjogap = "Kompýuter, elektrik elektronikasy, matematika, fizika, gurluşyk, awiasiýa inžinerçiligi. Senagat Eng. we ş.m.";

    public static String Ajogap_en = "Forestry engineering, agriculture, veterinary medicine, environmental engineering, fisheries, tourism, mining, archaeology, sports, meteorology, geography, etc.";
    public static String Bjogap_en = "Textile engineering, radio-television engineering, technical workers, architect, technical specialist, technical teachers; Dental technician, mechanical engineer, etc.";
    public static String Cjogap_en = "Law (lawyer, judge, prosecutor), Political, business, management, etc.";
    public static String Djogap_en = "Photography, film, theater, music, painting, sculpture, architecture, landscape architecture, archaeologist, art history, archaeology, etc.";
    public static String Ejogap_en = "Literature teacher, journalist, teacher, theologian, public relations specialist, educator, marketer, consultant, history, etc.";
    public static String Fjogap_en = "Psychology, Sociology, Philosophy, Anthropology, Law, Marketing, Public Administration, journalist, editor, Public Relations, etc.";
    public static String Gjogap_en = "Translation, teaching foreign languages, philology, hotel management, tourism management, international relations, etc.";
    public static String Hjogap_en = "Biologist, doctor, pharmacist, dentist, nurse, veterinarian, chemist, etc.";
    public static String Ijogap_en = "Economist, banker, merchant, treasurer, government administrator, economist, accountant, etc.";
    public static String Jjogap_en = "Computer, electrical electronics, mathematics, physics, construction, aviation engineering. Industrial Eng., etc.";

    public static String Ajogap_ru = "Лесное хозяйство, сельское хозяйство, ветеринария, экологическая инженерия, рыболовство, туризм, горное дело, археология, спорт, метеорология, география и т.д.";
    public static String Bjogap_ru = "Текстильная инженерия, радиотелевизионная инженерия, технические работники, архитектор, технический специалист, технические преподаватели; Зубной техник, механик и т.д.";
    public static String Cjogap_ru = "Право (адвокат, судья, прокурор), Политика, бизнес, управление и т.д.";
    public static String Djogap_ru = "Фотография, кино, театр, музыка, живопись, скульптура, архитектура, ландшафтная архитектура, археолог, история искусства, археология и т.д.";
    public static String Ejogap_ru = "Учитель литературы, журналист, учитель, теолог, специалист по связям с общественностью, педагог, маркетолог, консультант, история и т.д.";
    public static String Fjogap_ru = "Психология, Социология, Философия, Антропология, Право, Маркетинг, Государственное управление, журналист, редактор, Связи с общественностью и т.д.";
    public static String Gjogap_ru = "Перевод, преподавание иностранных языков, филология, управление отелями, управление туризмом, международные отношения и т.д.";
    public static String Hjogap_ru = "Биолог, врач, фармацевт, стоматолог, медсестра, ветеринар, химик и т.д.";
    public static String Ijogap_ru = "Экономист, банкир, торговец, казначей, государственный администратор, экономист, бухгалтер и т.д.";
    public static String Jjogap_ru = "Компьютер, электроника, математика, физика, строительство, авиационная инженерия. Промышленная инженерия и т.д.";



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


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogap);

        textView = findViewById(R.id.JOGAP);


        ArrayList<Integer> list = new ArrayList<>();

        list.add(Alar);
        list.add(Blar);
        list.add(Clar);
        list.add(Dlar);
        list.add(Elar);
        list.add(Flar);
        list.add(Glar);
        list.add(Hlar);
        list.add(Ilar);
        list.add(Jlar);

        list.sort(Collections.reverseOrder());


        Map<Integer, String> scoreToTextMap = new HashMap<>();

        String tazedensynans = "";
        if (MainActivity.tm) {
            tazedensynans = getString(R.string.tazedensynans_tm);

            scoreToTextMap.put(Alar, Ajogap);
            scoreToTextMap.put(Blar, Bjogap);
            scoreToTextMap.put(Clar, Cjogap);
            scoreToTextMap.put(Dlar, Djogap);
            scoreToTextMap.put(Elar, Ejogap);
            scoreToTextMap.put(Flar, Fjogap);
            scoreToTextMap.put(Glar, Gjogap);
            scoreToTextMap.put(Hlar, Hjogap);
            scoreToTextMap.put(Ilar, Ijogap);
            scoreToTextMap.put(Jlar, Jjogap);
        } else if (MainActivity.en) {
            tazedensynans = getString(R.string.tazedensynans_en);

            scoreToTextMap.put(Alar, Ajogap_en);
            scoreToTextMap.put(Blar, Bjogap_en);
            scoreToTextMap.put(Clar, Cjogap_en);
            scoreToTextMap.put(Dlar, Djogap_en);
            scoreToTextMap.put(Elar, Ejogap_en);
            scoreToTextMap.put(Flar, Fjogap_en);
            scoreToTextMap.put(Glar, Gjogap_en);
            scoreToTextMap.put(Hlar, Hjogap_en);
            scoreToTextMap.put(Ilar, Ijogap_en);
            scoreToTextMap.put(Jlar, Jjogap_en);
        } else if (MainActivity.ru) {
            tazedensynans = getString(R.string.tazedensynans_ru);

            scoreToTextMap.put(Alar, Ajogap_ru);
            scoreToTextMap.put(Blar, Bjogap_ru);
            scoreToTextMap.put(Clar, Cjogap_ru);
            scoreToTextMap.put(Dlar, Djogap_ru);
            scoreToTextMap.put(Elar, Ejogap_ru);
            scoreToTextMap.put(Flar, Fjogap_ru);
            scoreToTextMap.put(Glar, Gjogap_ru);
            scoreToTextMap.put(Hlar, Hjogap_ru);
            scoreToTextMap.put(Ilar, Ijogap_ru);
            scoreToTextMap.put(Jlar, Jjogap_ru);
        }



        int highestScore = list.get(0);

        String resultText = scoreToTextMap.get(highestScore);

        if (highestScore == 0) {
            textView.setText(tazedensynans);
        } else {
            textView.setText(resultText);
        }
    }

}