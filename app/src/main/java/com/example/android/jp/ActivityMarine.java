package com.example.android.jp;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.ArrayList;
import java.util.List;

public class ActivityMarine extends AppCompatActivity  {


    private ImageButton backForMainActivity, btnBackMenu;
    List<ListElement> element;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_dinolist);

        //getSupportActionBar().hide();

        init();

        backForMainActivity= findViewById(R.id.backForMainActivity);
        btnBackMenu= findViewById(R.id.btnBackMenu);
        backForMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                Animatoo.animateFade(ActivityMarine.this);
                finish();

            }
        });

        btnBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                Animatoo.animateFade(ActivityMarine.this);
                finish();

            }
        });


    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        Animatoo.animateFade(ActivityMarine.this);
        finish();
    }


    public void init(){

        element=new ArrayList<>();
        element.add(new ListElement(R.drawable.dicozaur1,R.drawable.dicozaur2,R.drawable.dicozaur3,R.drawable.dicozaur4,R.drawable.dicozaur5,R.drawable.dicozaur6,R.drawable.dicozaur7,R.drawable.dicozaur8,R.drawable.dicozaurskelet,
                "Дакозавр","Длина:","4-5","м.","-","м.","0,45-0,91","т.","юрский-меловой","\"Кусающий ящер\"",
                " Дакозавры (лат. Dakosaurus) — род морских крокодиломорфов позднеюрской-раннемеловой эпохи. Относятся к так называемым «морским крокодилам» — семейству Metriorhynchidae. Это единственные полностью морские архозавры. Одни из немногих метриоринхид, приспособленных почти исключительно к охоте на крупную добычу." +
                        "\n\n •История изучения" +
                        "Описаны Ф. Квенштедтом в 1856 году, долгое время были известны по отдельным зубам из юрских отложений Западной Европы. Синонимы — Dacosaurus, Ltliminosaurus, Neustosaurus, Plesiosuchus. Brachytaenius perennis. Были описаны Г. фон Мейером еще в 1842 году, но название признано недействительным." +
                        "\n В настоящее время признано 6-7 видов." +
                        "\n\n •Виды" +
                        "\n -Dakosaurus maximus (Quenstedt, 1846) — типовой вид. Известен из позднего киммериджа — раннего титона Англии, Франции, Швейцарии и Германии. Описан из Германии. Известен полный скелет около 6 метров длиной. Череп изображается относительно низким, но в реальности плохо известен. Более вероятно, что череп по очертаниям напоминал череп Dakosaurus andiniensis.\n" +
                        " -Dakosaurus paradoxus (Wagner, 1853) — описан по зубам из поздней юры Германии.\n" +
                        " -Dakosaurus primaeuvs (Sauvage, 1871) — зубы из поздней юры Франции.\n" +
                        " -Dakosaurus lapparenti (Deblemas & Strannoloubsky, 1957) — зубы из раннего мела (валанжин) Франции.\n" +
                        " -Dakosaurus andiniensis (Vignaud & Gasparini, 1996) — из поздней юры — раннего мела (титон — берриас) Аргентины. Открыт в Неквенском бассейне в 1987 году, первоначально считался видом метриоринха. Описан в 1996 году. В 2006 году был найден полный череп этого вида, показавший его крайнюю специализацию к охоте на крупную добычу. В средствах массовой информации вид получил прозвище «Годзилла». Длина животного была около 4 метров. Его череп разительно похож на черепа наземных хищных динозавров, что предполагает образ жизни крупного хищника/падальщика. В 2007 году остатки дакозавра обнаружены в киммеридже Мексики." +
                        "\n -Dakosaurus carpenteri (Wilkinson et al., 2008) — примитивный вид, чрезвычайно сходный с короткомордыми метриоринхами. Описан в 2008 году из киммериджа Англии." +
                        "\n\n •Описание" +
                        "\n Размеры крупные (череп до 1 метра длиной, общая длина до 6 метров). Морда короткая, спереди закругленная, череп высокий, зубы огромные, немногочисленные, зифодонтные (как у хищных динозавров). Глазницы крупные, со склеральным кольцом. Имеется предглазничное окно, вероятно, вмещавшее солевую железу. Сверху предглазничное окно прикрыто выростами черепа." +
                        "\n\n Конечности преобразованы в ласты, особенно передние. Передние ласты значительно короче задних. Конец хвоста изогнут вниз и служил основой для хвостового плавника, сходного с таковым ихтиозавров. Панцирь редуцирован." +
                        "\n\n •Образ жизни" +
                        "\n По образу жизни дакозавры (особенно Dakosaurus andiniensis) могли напоминать китов-косаток. Интересно, что большинство видов делило море с крупными плиозаврами. Возможно, дакозавры были в большей степени падальщиками." +
                        "\n\n Неизвестно, как размножались морские крокодилы. Судя по всему, они должны были откладывать яйца (яйца крокодилов одеты твердой скорлупой и живородящих видов среди современных крокодилов нет). Для этого надо выходить на сушу. Возможно, именно эта особенность ограничила их размеры (среди метриоринхид нет гигантских видов) и привела в итоге к вымиранию группы в начале среднего мела."));


        element.add(new ListElement(R.drawable.ihteozavr1,R.drawable.ihteozavr2,R.drawable.ihteozavr3,R.drawable.ihteozavr4,R.drawable.ihteozavr5,R.drawable.ihteozavr6,R.drawable.ihteozavr7,R.drawable.ihteozavr8,R.drawable.ihteozavrskelet,
                "Ихтиозавры","Длина:","1-20","м.","-","м.","0,10-40","т.","юрский-меловой","\"Рыба-ящер\"",
                " Ихтиозавр (лат. Ichthyosaurus) — широко известный род морских рептилий, обитавших в начале юрского периода, около 196.5—183 млн лет назад." +
                        "\n\n •История изучения" +
                        "\n История находки первого ихтиозавра, а также других известных мезозойских рептилий из английских морских отложений Дорсета, тесно связаны с именем Мэри Эннинг, одного из самых значимых любителей-натуралистов, которые провели большую часть своей жизни бродя по каменистым утесам и собирая уникальные окаменелости на склонах «Юрского побережья», районе, получившим широкую известность благодаря изобилию окаменелостей множества вымерших существ." +
                        "\n\n В 1817 году немецкий натуралист Карл Дитрих Эберхард Кёниг, бывший в то время куратором отдела естественной истории в Британском музее (Англия), впервые упомянул название Ichthyosaurus — «рыба-ящер». Это название было опубликовано им в связи с недавним обнаружением неизвестной морской рептилии в Лайм-Реджисе, графство Дорсет. Эта история началась в 1811 году, когда в блоке упавшего сланца, Джозеф Эннинг нашел массивный 1,2 метровый череп, который он принял за гигантского крокодила. В этом не было ничего исключительного — к тому времени многие ископаемые крокодилы уже были известны, но эта находка сильно увлекла его сестру, Мэри Эннинг, которой в то время было всего двенадцать лет. Она снова отправилась на поиски и в течение нескольких месяцев медленно перебирала камни, в надежде найти остальную часть скелета, в конце концов ей все же удалось обнаружить ископаемые останки передней части скелета этого животного." +
                        "\n\n Эта замечательная находка стала первой отлично сохранившейся окаменелостью ихтиозавра, вскоре последовали и другие — новые окаменелости, поступающие из Дорсета, Йоркширского побережья и известняковых карьеров Сомерсета, дали много нового материала для идентификации и научного изучения ихтиозавров. Изучением вымерших морских рептилий занимался Генри де ла Беш, английский геолог и палеонтолог из Британского геологического общества. Он стал активным коллекционером и иллюстратором ископаемых, сотрудничая с известным геологом Уильямом Конибером, совместно, они опубликовали первую статью об анатомии ихтиозавра и плезиозавра, которая была представлена \u200B\u200BГеологическому Обществу в 1821 году. В 1821—1822 годах они описали первых четыре вида ихтиозавра: Ichthyosaurus communis, Ichthyosaurus intermedius, Ichthyosaurus platyodon (сейчас Temnodontosaurus) и Ichthyosaurus tenuirostris (сейчас Leptonectes). Их представления о плезиозаврах были подтверждены новой находкой практически полного скелета, который обнаружила Мэри Эннинг в 1823 году. В следующем году Конибер представил описание этой находки Геологическому обществу, другие его наиболее важные публикации о юго-западном угольном районе Англии, были написаны совместно с доктором Бакландом и опубликованы в 1824 году." +
                        "\n\n Следует заметить, что принадлежность самого первого найденного образца, всё еще не была общепринята, об этом можно судить по публикации в «Тонтон-курьер» 18 мая 1825 года: «Мисс Мэри Эннинг выявила еще одно допотопное животное из West Cliff (Западный Дорсет), в Лайме, длиной около двух с половиной футов длины, которое, по-видимому, является видом Icthyosaurus Intermedius и находится в отличном состоянии. Одна очень удивительная особенность заключается в том, что сохранились даже отпечатки кожи, видимо покрытой небольшими чешуйками»." +
                        "\n\n •Описание" +
                        "\n Дельфиноподобный облик ихтиозавра знаком нам по множеству изображений, однако схожесть ихтиозавров с дельфинами — пример конвергентной эволюции. Его обтекаемое тело идеально подходило для стремительной охоты в воде. Продвижение вперёд осуществлялось с помощью акульего хвоста, для стабилизации животное использовало спинной и грудные плавники. Как и других представителей отряда, ихтиозавра отличали большие глаза и длинные челюсти с острыми зубами. Ихтиозавры были морскими рептилиями средних размеров, длиной около 3,3 метра (11 футов). Сотни хорошо сохранившихся, окаменевших скелетов были найдены в юрских морских отложениях в Лайм-Риджисе, Англия и в Хольцмадене, Германия. Многие из костей содержат прижизненную артикуляцию (сочленение), а скелеты сохраняют отпечатки частей тела, плавников и фрагментов кожи. Ихтиозавр был хищником, изучение его копролитов (ископаемых экскрементов) и содержимого окаменевших желудков показало, что рацион этой рептилии составляли исключительно некрупные рыбы и кальмары. Большие округлые глазницы свидетельствуют о немаловажной роли зрения в жизни животного. Твёрдая структура костей, образующих ухо, наталкивает на мысль, что при охоте ихтиозавр также полагался на свой слух. Ощущая вибрацию в воде, ихтиозавр мог буквально «слышать» добычу на большом расстоянии. Некоторые окаменелости даже сохраняют уникальные образцы эмбрионов, что указывает на то, что ихтиозавры были живородящими. Особенно отчетливо это можно наблюдать на немецких образцах стеноптеригия (Stenopterygius)." +
                        "\n\n •Виды" +
                        "\n Согласно таксономической переоценке ихтиозавров (Lomax & Massare, 2017), выделяются шесть видов:" +
                        "\n -Ichthyosaurus communis (De la Beche & Conybeare, 1821)\n" +
                        " -Ichthyosaurus breviceps (Owen, 1881)\n" +
                        " -Ichthyosaurus conybeari (Lydekker, 1888)\n" +
                        " -Ichthyosaurus anningae (Lomax & Massare, 2015)\n" +
                        " -Ichthyosaurus larkini (Lomax & Massare, 2017)\n" +
                        " -Ichthyosaurus somersetensis (Lomax & Massare, 2017)"));

        element.add(new ListElement(R.drawable.mosasaurus1,R.drawable.mosasaurus2,R.drawable.mosasaurus3,R.drawable.mosasaurus4,R.drawable.mosasaurus5,R.drawable.mosasaurus6,R.drawable.mosasaurus7,R.drawable.mosasaurus8,R.drawable.mosasaurusskelet,
                "Мозазавр","Длина:","10–17","м.","-","м.","15-40","т.","меловой","\"ящер с реки Моза\"",
                " Мозазавр - первый из описанных представителей семейства морских рептилий, обитал в меловом периоде 70-66 млн лет назад." +
                        "\n\n •История находки" +
                        "\n Первые останки, ставшие известными науке - фрагментарный череп из мелового карьера в Санкт-Питерсберге, Нидерланды. Череп был найден в 1764 году, через два года его выкопал Жан Батист Друин. В 1784 году череп приобрел Мартинус ван Марум, первый директор музея Тайлера в Харлеме, который опубликовал его описание в 1790 году, Марум считал, что это разновидность «большой рыбы, или кита». Этот экземпляр, до сих пор является частью коллекции музея." +
                        "\n\n •Описание" +
                        "\n Мозазавры были крупными морскими рептилиями с длиной тела 10-17 метров. Наиболее крупный из известных видов, М. hoffmannii достигал длины более 17 м (56 футов), и был длиннее, чем тилозавр и хайнозавр. У мозазавров стопы конечностей эволюционировали в ласты, передние из которых были крупнее чем на задних конечностях. Скелет состоял из примерно 45—46 предкрестцовых позвонков, 8 крестцовых, 21 промежуточных хвостовых с «шевронами» и более 54 терминальных хвостовых позвонков. Хвост составляет примерно половину от общей длинны и скорее всего оканчивался небольшим хвостовым плавником. Ранее считалось, что мозазавры использовали \"угревидный\" способ плавания, также как и их более мелкие сородичи. Биомеханические реконструкции показали, что во время броска мозазавры могли передвигаться со скоростью более 20 километров в час. Они также отличались довольно мощным, но узким черепом с частично утраченной подвижностью между костями и массивными зубами, приспособленными к дроблению костей и разрыванию плоти. Хотя зубы небольших мозазавров, таких как некоторые представители вида Mosasaurus condon и M. missouriensis, больше подходили скорее для прокалывания, чем для разрывания. Вероятно, мозазавры питались преимущественно рыбой и другими морскими рептилиями, например плезиозаврами (Plesiosaurus). Известны находки панцирей морских черепах (Allopleuron hofmanni) со следами, предположительно от зубов крупных мозазавров." +
                        "\n\n Исследования показали, что несмотря на то, что мозазавры обладали довольно большими глазами, у них было плохое бинокулярное зрение и плохо развитые обонятельные луковицы, эксперты считают, что мозазавры жили вблизи поверхности океана, где охотились на рыб, черепах, аммонитов, птиц , птерозавров и плезиозавров. Несмотря на то, что они были в состоянии нырять, они видимо, не углублялись в более глубокие воды." +
                        "\n\n• Виды" +
                        "\n Мозазавр является исторически одним из самых известных родов рептилий из позднемеловых морских отложений. Ряд видов этого рода был описан с пяти континентов: Европы и Северной Америки, а также трудно идентифицированный материал из Африки, Новой Зеландии и Японии. Начиная с 1822 года было описано около 50 видов рода Mosasaurus. Однако таксономический статус между европейскими и североамериканскими видами был проблематичным и несколько видов были синонимизированы и неоднократно пересмотрены, главным образом, из-за плохого качества сохранения и неполноты голотипов. Согласно исследованию Майкла Уэйна Колдуела от 2016 года признаются действительными только пять видов мозазавра."));




        element.add(new ListElement(R.drawable.ophthalmosaurus1,R.drawable.ophthalmosaurus2,R.drawable.ophthalmosaurus3,R.drawable.ophthalmosaurus4,R.drawable.ophthalmosaurus5,R.drawable.ophthalmosaurus6,R.drawable.ophthalmosaurus7,R.drawable.ophthalmosaurus8,R.drawable.ophthalmosaurusskelet,
                "Офтальмозавр","Длина:","4-6","м.","-","м.","3","т.","юрский","\"Ящер глаз\"",
                " Офтальмозавр (лат. Ophthalmosaurus) — юрский ихтиозавр, обитавший на территории Европы и Северной Америки, около 162-151 млн лет назад." +
                        "\n\n •Описание" +
                        "\n Офтальмозавр имел изящное 4-6 метровое дельфинообразное тело, а его почти беззубая челюсть была хорошо приспособлена для ловли кальмаров. Основные ископаемые находки этого рода были зарегистрированы в Европе и Северной Америке. Офтальмозавр имел обтекаемое тело и хвостовой плавник, в форме полумесяца. Его передние конечности были более развитыми, чем задние, это говорит о том, что передние плавники служили «рулевым управлением», а мощный хвост придавал ускорение движению. Важной особенностью офтальмозавра являются его глаза, которые достигали около 220 мм (9 дюймов) в диаметре и были чрезвычайно велики по сравнению с его телом, склеротические кольца имели центральное отверстие диаметром около 100 мм. По словам Ресюке Мотани, в пропорциональном соотношении, этот показатель превосходит максимальные значения у темнодонтозавра (Temnodontosaurus), который при длине около 9 метров имел размер склеротических колец в 253 мм по внешнему диаметру и размер глаза, вероятно, около 300 мм в диаметре. Глаза занимали почти все пространство на черепе и были защищены костными пластинами, склеротическими кольцами, которые, скорее всего, защищали глаза от давления воды на большой глубине. Размер глаз и крупные склеротические кольца свидетельствует о том, что офтальмозавр, вероятно, охотился на глубине или что он являлся ночным охотником. Как и другие ихтиозавры, офтальмозавр был живородящим. Ископаемые находки скелетов эмбрионов были найдены у нескольких образцов, а размеры выводка варьировались от двух до одиннадцати младенцев. Проведенные расчеты позволяют предположить, что 4-метровый офтальмозавр мог погружаться на 20 минут и более. По оценкам, средняя скорость офтальмозавра составляет около 2,5 м/с (9 км/ч), но даже при очень консервативной оценки скорости в 1 м/с (3,6 км/ч), офтальмозавр мог погрузиться на 600 метров и вернуться на поверхность в течение 20 минут."));




        element.add(new ListElement(R.drawable.pleziozavr1,R.drawable.pleziozavr2,R.drawable.pleziozavr3,R.drawable.pleziozavr4,R.drawable.pleziozavr5,R.drawable.pleziozavr6,R.drawable.pleziozavr7,R.drawable.pleziozavr8,R.drawable.pleziozavrskelet,
                "Плезиозавр","Длина:","11-15","м.","2","м.","20-25","т.","триасовый-меловой","\"Cхожий, близкий ящер\"",
                " Плезиозавр (лат. Plesiosaurus) — род юрских плезиозавров средних размеров, обитавших в обширных морях на территории современной Великобритании." +
                        "\n\n •История находки" +
                        "\n Это был первый из описанных видов плезиозавров, обнаруженный на территории графства Дорсет (Англия). Окаменевший скелет был обнаружен Мэри Эннинг, в юрских отложениях Лайм-Риджиса, длина образца оценивается в 3-3,5 метра (10-11 футов). В 1824 году найденный экземпляр был описан Уильямом Конибером под видом Plesiosaurus dolichodeirus. Ископаемый образец, находится в Лондонском Музее естественной истории." +
                        "\n\n •Описание" +
                        "\n Плезиозавр P. dolichodeirus внешне похож на других представителей отряда плезиозавров. Образец, найденный Мэри Эннинг, датируется синемюрским веком юрского периода, возрастом 199—190 млн лет назад. По сравнению с другими плезиозаврами, у данного вида, была небольшая голова. Череп намного уже и длиннее, достигает наибольшей ширины прямо за глазами. Передняя часть головы имеет «треугольную» форму. Внешние ноздри перекрывают внутренние ноздри, они расположены не на кончике рыла, а ближе к глазам. В отличие от ноздрей ромалеозавра (Rhomaleosaurus) они, похоже, не были приспособлены для подводного обоняния. Зубы плезиозавра — это простые «иглоподобные конусы», которые слегка изогнуты и округлые в поперечном сечении. Челюсти имеют от 20 до 25 зубов в верхней части челюсти и 24 зуба в нижнем отделе." +
                        "\n\n Плезиозавра считают среднеразмерным представителем семейства, который мог вырастать до 3,5 метров в длину. Шея ящера состояла в среднем из 40 позвонков; различные экземпляры сохранили от 38 до 42 шейных позвонков. Оставшаяся часть позвоночника состоит из нескольких (4 или 5 в образце голотипа) «грудных» позвонков, примерно 21 спинной позвонок, 3 или более крестцовых и как минимум 28 хвостовых позвонков. Как правило, тела шейных позвонков вытянутые и немногим более длинные, чем высокие. Ширина, как правило, больше или равна длине. Суставные поверхности тела шейного позвонка имеют слегка вогнутую форму с округлыми краями. На вентральной поверхности тела позвонка обнаруживаются маленькие отверстия, называемые лат. foramina subcentralia." +
                        "\n\n Рёбра расположены от шеи до хвоста. Шейные рёбра имеют форму топорика и несут 2 суставные головки. Спинные рёбра толстые и несут только 1 головку. Рёбра крестца короткие, крепкие и тупые, заканчиваются шишковидными образованиями на обоих концах. Хвостовые рёбра имеют различную морфологию в зависимости от своего расположения вдоль хвоста, причем передние рёбра заострённые, а расположенные ближе к концу хвоста — широкие и тупоконечные. Помимо непосредственно рёбер у плезиозавров были гастралии, или «брюшные рёбра». 9 и более пар гастралий имеются между плечом и тазом. Каждый их набор состоит из 7 элементов: кость в середине, окружённая 3 боковыми элементами." +
                        "\n\n Плечевой пояс известен лишь частично, но, видимо, он типичен для плезиозавров. Он состоит из слитых на переднем крае ключиц, лопаток и больших коракоидов. И лопатки, и коракоиды соединены с гленоидной впадиной. Пара овальных отверстий, называемых грудными окнами, располагаются посередине вдоль лопаточно-коракоидного сочленения. Передние конечности удлиненные и относительно узкие по сравнению с таковыми у большинства представителей семейства. Плечевая кость имеет отличительную кривизну, которая, по-видимому, является общей примитивной чертой, характерной для завроптеригий. Зрелые плезиозавры также имеют характерную бороздку вдоль вентральной поверхности плечевой кости. Предплечье включает плоскую, широкую, в форме полумесяца локтевую кость и «крепкую, подобную столбу» лучевую кость. Запястье состоит из 6 костей. В передних плавниках было по 5 пальцев, формула фаланг неясна." +
                        "\n\n Таз животного состоит из лобковых, седалищных и лопатоподобных подвздошных костей. Вертлужная впадина образована поверхностями лобковых и седалищных костей. Как и в плечевом поясе, между седалищными и лобковыми костями имеется пара отверстий. Задние конечности длинные и узкие, у взрослых животных они значительно меньше передних. Бедренные кости прямые. Задние конечности включают 2 примерно одинаковые по размеру кости, крепкие берцовые и малоберцовые кости в форме полумесяца. В лодыжке 6 костей. Задние плавники содержат по 5 пальцев." +
                        "\n\n •История изучения" +
                        "\n Первый полный скелет плезиозавра был обнаружен ранним палеонтологом и охотницей за окаменелостями Мэри Эннинг в породах синемурийского (раннеюрского) возраста нижней группы Лиас в декабре 1823 г. Дополнительные окаменелости плезиозавра были обнаружены в породах группы Лиас в Дорсете в течение многих лет, «до прекращения добычи полезных ископаемых в группе Лиас в начале этого [двадцатого] века»." +
                        "\n\n Плезиозавр был одним из первых «допотопных рептилий», обнаруженных и вызвавших большой интерес в викторианской Англии. Его так назвали («почти ящерица») Уильям Конибир и Генри Де ла Беш, чтобы указать, что он был больше похож на нормальную рептилию, чем на ихтиозавра, который был найден в тех же пластах породы всего несколькими годами ранее. Плезиозавр — архетипический род Plesiosauria, описанный первым, отсюда и название этого отряда. Конибер и Де ла Беш придумали название для разрозненных находок из региона Бристоль, Дорсет и Лайм-Реджис в 1821 году. Типовой вид плезиозавра, P. dolichodeirus, был назван и описан Конибером в 1824 году на основе оригинальных находок Эннинг."));





        element.add(new ListElement(R.drawable.pliozavr1,R.drawable.pliozavr2,R.drawable.pliozavr3,R.drawable.pliozavr4,R.drawable.pliozavr5,R.drawable.pliozavr6,R.drawable.pliozavr7,R.drawable.pliozavr8,R.drawable.pliozavrskelet,
                "Плиозавр","Длина:","10-13","м.","-","м.","7-15","т.","юрский-меловой","\"Более ящер\"",
                " Плиозавры (лат. Pliosaurus) — морские хищные рептилии, обитавшие в океанах, с середины юрского до начала мелового периода на территории современной Англии, Норвегии и России." +
                        "\n\n •История находки" +
                        "\n Первые ископаемые окаменелости были найдены в английском позднеюрском формировании Киммериджеской глины. В 1822 году Уильям Дэвид Конибер описал фигурные позвонки из-под Уэймута и упомянул аналогичные останки из окрестностей Оксфорда. Позже, в 1824 году, он также отметил фрагментарные останки короткошеего плезиозавра из коллекции Уильяма Бакленда, найденных в Линкольншире и предложил использовать название Plesiosaurus giganteus, для короткошеих плезиозавров в целом. Другие фрагментарные останки были собраны профессором Уильямом Баклендом и состоят из частичного черепа, нижней челюсти, позвонков и материала конечностей, образцы находятся в музее естественной истории Оксфордского университета. В 1841 году английский палеонтолог Ричард Оуэн создает подрод «Pleiosaurus» для нового вида плезиозавра Pleiosaurus brachydeirus, родовое название происходит от πλειων, pleion, что означает «больше» и σαυρος, sauros, что означает «ящерица», со ссылкой на убеждение Оуэна, что плиозавр был более тесно связан с крокодило-подобными ящерицами, чем плезиозавр. В следующем году Оуэн классифицирует подрод «Pleiosaurus» в собственном роде Pliosaurus. Дальнейшие открытия из Великобритании, пополняются позднеюрскими останками плиозаврид из Франции, Северной Америки, России, Мексики, Кубы и Шпицбергена, в результате описываются множество новых видов, многие из которых описываются по отдельным костям, зубам или изолированным фрагментам. В настоящее время, из многих, первых описанных видов формации Киммеридж Клэй, признаются только три вида плиозавров: P. brachydeirus, P. brachyspondylus и P. macromerus." +
                        "\n\n •Описание" +
                        "\n Плиозавры составляют часть более крупной группы морских рептилий — плезиозавров, характеризующихся различными пропорциями тела, в том числе чрезвычайно длинношеих видов с маленькой головой, таких как эласмозавр и короткошеих видов с огромными черепами, таких как лиоплевродон. Плиозавры были доминирующими юрскими хищниками в океане, достигающие размера в 10-13 метров. Они имели глобальное распространение на протяжении длительного отрезка времени, от ранней юры до начала позднего мела. Плиозавры имели мощные черепа, длиной от 1,7 м до более 2 метров, крупные размеры тела и трехгранные зубы, предполагающие хищнические привычки. Данные проведенных исследований, подтверждают тенденцию снижения длины нижней челюсти после позднеюрского периода, это может быть связано с адаптацией к питанию на крупную добычу. Максимальный размер тела плиозавров, увеличивался, после их первого появления в ранней юре до раннего мела, тем не менее, некоторое снижение произошло до их окончательного исчезновения в начале позднего мела. Анатомия плиозавров и крупных видов в частности, достоверно не известна, так что к любым оценкам общей длины необходимо относиться с некоторой осторожностью. Тарло (Tarlo, 1959) реконструировал плиозавра лиоплевродона с общей длиной в семь раз больше, чем череп. Это давало общую длину в 16,8 метров. Тем не менее, образцы геологически довольно молодых плиозавров, сохранившихся в естественном сочленении (Акоста и др, 1979) показывают, что общая длина была ближе к пропорции 5 Х 1, что дает общую длину 12 метров. Пока не появятся новые полные образцы, любые оценки размеров являются спекулятивными и довольно недостоверными. Оценивать вес такого животного является еще более проблематичным, и зависит от многих предположений. Даже при полной скелетной реконструкции, реконструкция мягких тканей в значительной степени является предположительной, что дает разброс от 7 до 15 тонн."));



        element.add(new ListElement(R.drawable.talassomedon1,R.drawable.talassomedon2,R.drawable.talassomedon3,R.drawable.talassomedon4,R.drawable.talassomedon5,R.drawable.talassomedon6,R.drawable.talassomedon7,R.drawable.talassomedon8,R.drawable.talassomedonskelet,
                "Талассомедон","Длина:","12.5","м.","-","м.","-","т.","меловой","\"Повелитель морей\"",
                " Талассомедон (лат. Thalassomedon) — род плезиозавров мелового периода из США, обитал около 95 млн лет назад." +
                        "\n\n •История находки" +
                        "\n Ископаемые окаменелости этого плезиозавра были обнаружены в 1939 году, в морском глинистом сланце Гранерос Шейл, округа Бака, штат Колорадо (США). В 1943 году Самуэль Уэллс описал найденный экземпляр, состоявший из частичного скелета с черепом, под видом Thalassomedon haningtoni. Название рода образовано от греч. thalassa — «море» и греч. medon — «лорд (повелитель)». Экземпляр DMNH 1588 достигает примерно 11,5 метров (38 футов) в длину, череп был около 47 см (19 дюймов)." +
                        "\n\n В 1970 году Сэм Уэллс опубликовал работу «Самая длинная шея океана» в музейных публикациях Государственного музея Университета штата Небраска. Работа была посвящена открытию очень крупного плезиозавра из восточной Небраски в 1964 году. Образец был найден довольно полным, хотя некоторые хвостовые позвонки разрушились и были потеряны ещё до обнаружения находки. Было заявлено, что размер этого плезиозавра составляет около 41 фута (12,5 м) длиной, как и эласмозавр, описанный Коупом. Тем не менее, у него было меньше шейных позвонков, чем у Elasmosaurus platyurus (63 против 71). Голова и большая часть шеи этого экземпляра экспонируются на выставке в Государственном музее Университета штата Небраска, Линкольн, штат Нью-Йорк, вместе с 80-ю обнаруженными гастролитами. Этот череп достигает около 50,8 см (20 дюймов) в длину, немного больше, чем образец Thalassomedon haningtoni, в Денверском музее природы и науки." +
                        "\n\n •Описание" +
                        "\n Талассомедон был эласмозавридом, плезиозавром у которого была очень длинная шея и морда с острыми зубами, длиной до 5 см, коротким заостренным хвостом и четырьмя крупными ластами. Талассомедон входит в число крупнейших эласмозаврид общей длиной тела, сопоставимой с эласмозавром. Шея очень длинная, она состоит из 63 позвонков и достигала около 5,9 метра (19 футов) — более половины общей длины. Ласты были длиной около 1,5—2 м (4,9—6,6 фута). Камни, обнаруженные в области желудка, как предполагается, использовались для балласта или пищеварения, помогая перетирать проглоченную пищу."));


        element.add(new ListElement(R.drawable.shestazavr1,R.drawable.shestazavr2,R.drawable.shestazavr3,R.drawable.shestazavr4,R.drawable.shestazavr5,R.drawable.shestazavr6,R.drawable.shestazavr7,R.drawable.shestazavr8,R.drawable.shastasaurusskelet,
                "Шастазавры","Длина:","4-21","м.","-","м.","62-68","т.","триасовый","\"Ящер из округа Шаста\"",
                " Шастазавр — род триасовых ихтиозавров, обитавших на территории Северной Америки около 235-205 млн лет назад" +
                        "\n\n •Описание" +
                        "\n Являлся узкоспециализированным животным, значительно отличающимся от других ихтиозавров. У него было узкое удлинённое туловище. Самые крупные особи имели грудную клетку чуть меньше двух метров в ширину, несмотря на расстояние около семи метров между плавниками. Из-за необычайно короткого беззубого рыла (по сравнению с длинными зубастыми мордами других ихтиозавров) была выдвинута гипотеза о всасывающем питании шастазавра мягкотелыми головоногими моллюсками, хотя современные исследования показывают, что ихтиозавровые челюсти не подходят для всасывания пищи.Рыло сильно сжато из-за уникального расположения костей черепа. В отличие от почти всех других рептилий, носовая кость, которая обычно образуется в средней части черепа, продолжается до самых ноздрей, и все кости черепа очень узки. На большинстве артов изображается с характерным для ихиозаврид спинным плавником, хотя нет доказательств, подтверждающих или опровергающих его присутствие."));


        element.add(new ListElement(R.drawable.elasmosaurus1,R.drawable.elasmosaurus2,R.drawable.elasmosaurus3,R.drawable.elasmosaurus4,R.drawable.elasmosaurus5,R.drawable.elasmosaurus6,R.drawable.elasmosaurus7,R.drawable.elasmosaurus8,R.drawable.elasmosaurusskelet,
                "Эласмозавр","Длина:","10","м.","3,5","м.","0,5","т.","меловой","\"Ящер с тонкими пластинами\"",
                " Эласмозавр (лат. Elasmosaurus) — знаменитый крупный длинношеий плезиозавр позднего мелового периода, обитал на территории современной Северной Америки около 80 млн лет назад." +
                        "\n\n •Описание" +
                        "\n Эласмозавр был длиной около 10,3 метра (34 фута), размер его тела определяется в сравнении с его близким родственником Albertonectes. Он имел обтекаемое тело с ластами на конечностях, короткий хвост, маленькую голову и чрезвычайно длинную шею. На сегодня, неполный образец голотипа, является единственным экземпляром Elasmosaurus. Он долго выставлялся на выставках, но теперь хранится в шкафу, вместе с другими похожими фрагментами. Найденный образец эласмозавра состоит из частей задней части правой челюсти, двух челюстных фрагментов с зубами, 72 шейных позвонков, включая атлас и ось, 3-х грудных позвонков, 6-ти задних позвонков, 4-х сакральных позвонков и 18-ти хвостовых позвонков, а также фрагментов ребер. На изображении Коупа присутствует грудной и тазовый пояс эласмозавра, но эти элементы были утрачены к 1906 году. В 1986 году была завершена трехмерная реконструкция модели эласмозавра и теперь она отображается в Академии естественных наук Филадельфии (с 2011 года Академия естественных наук Университета Дрекселя). Позднее эта реконструкция была скопирована компанией Triebold Paleontology Incorporated и эти копии были представлены в других музеях. Одна из них достигает около 12,8 м (42 фута) в длину."));


        ListAdapterDino listAdapter = new ListAdapterDino(element, this,  new ListAdapterDino.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recylcerDino);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void moveToDescription(ListElement item){
        Intent intent = new Intent(this,DescriptionActivity.class);
        intent.putExtra("ListElement",item);
        startActivity(intent);
        Animatoo.animateFade(ActivityMarine.this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    public void hideSystemUI() {

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


    // Отключение кнопки Назад
/*    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/


}
