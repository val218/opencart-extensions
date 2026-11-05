# Lastadia Žurnāls (IK un pašnodarbinātajiem) - lietošanas instrukcija (v1.6.4)

Ieņēmumu un izdevumu uzskaites žurnāls vienkāršā ieraksta sistēmā, aizpildīts automātiski no apmaksātiem pasūtījumiem. Formāts atbilst MK noteikumiem Nr. 322 par grāmatvedību vienkāršā ieraksta sistēmā (likumi.lv/ta/id/332883): **1. pielikums** (IIN maksātāji, 24 ailes), **2. pielikums** (MUN maksātāji, 15 ailes) un **3. pielikums** (izdevumu precizēšanas reģistrs).

Moduļa valoda: latviešu, angļu vai krievu (Iestatījumi → Moduļa valoda). Žurnāla izdruka un rēķini vienmēr ir latviešu valodā.

## Prasības
- OpenCart 3.0.x vai 4.0.x / 4.1.x (pārbaudīts ar 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4)
- Veikalā jābūt valūtai EUR

## Uzstādīšana
**OpenCart 3:** Extensions > Installer → augšupielādējiet `lv_journal_oc3.ocmod.zip` → Extensions > Extensions > Modules → "Lastadia Žurnāls – IK un pašnodarbinātajiem" → Install.
**OpenCart 4:** Extensions > Installer → augšupielādējiet `lv_journal.ocmod.zip` (nemainiet faila nosaukumu) → Install → Extensions > Extensions > Modules → Install.
Modulis atrodams izvēlnē **Reports > Lastadia Žurnāls**.

**Atjaunināšana no 1.0:** OpenCart 3 - vienkārši augšupielādējiet jauno zip. OpenCart 4 - Extensions > Installer, pie vecās versijas spiediet Uninstall (tikai faili, ne modulis), tad augšupielādējiet un instalējiet jauno. Žurnāla dati paliek; esošie importētie ieraksti tiek aizsargāti automātiski.

## Uzņēmuma profils (cilne "Uzņēmums")
1. Ievadiet reģistrācijas numuru un spiediet **Atrast**. Latvijas uzņēmumam nosaukums, juridiskā forma, adrese un PVN statuss tiek paņemti no Uzņēmumu reģistra un VID PVN maksātāju reģistra (atvērtie dati data.gov.lv); citas ES valsts uzņēmumam PVN numurs tiek pārbaudīts ES VIES. Fiziskas personas kods reģistros nav - datus ievadiet paši.
2. Visu var labot. Nozari (NACE 2.1) izvēlieties paši - publiskajos datos tās nav. Atzīmējiet darbības pazīmes (pakalpojumi no ārvalstīm, pakalpojumi ES uzņēmumiem, preces no ES, darbinieki, dalībnieki - fiziskas personas).
3. **Saglabāt un pielāgot automātiski.** Modulis nosaka: grāmatvedības sistēmu (vienkāršais ieraksts līdz 300 000 € apgrozījumam fiziskām personām un IK; SIA - vienmēr divkāršais), nodokļu režīmu (IIN, MUN 25% vai UIN 20% / 15% alternatīva no 2026, ja dalībnieki ir tikai fiziskas personas), PVN pienākumus (50 000 € slieksnis, OSS 10 000 €, preču iegāde no ES 10 000 €, reģistrācija neatkarīgi no apgrozījuma pakalpojumiem no ārvalstīm un ES uzņēmumiem, būvniecības pazīme), lauksaimniecībai - ieņēmumi 12. ailē, un vai jāsagatavo gada pārskats. Pie katra secinājuma ir saite uz avotu.
4. Rekvizīti rēķinos, PVN, žurnāla forma un ieņēmumu aile pielāgojas profilam; iestatījumos šos laukus vairs nevar mainīt, lai tie nerunātu pretī profilam.
5. Reizi 7 dienās modulis pārbauda PVN statusu VID reģistrā. Ja tas mainījies, pārskatā un cilnē "Uzņēmums" parādās brīdinājums ar pogu "Pieņemt reģistra statusu". Ja reģistrs nav sasniedzams, pārbaude atkārtojas pēc dienas.

Veikala serverim jāvar sasniegt `data.gov.lv` un `ec.europa.eu` (HTTPS). Ja hostings to bloķē, profilu var aizpildīt ar roku.

## Pirmie soļi
1. **Uzņēmums** (skat. augstāk) vai **Iestatījumi:** izvēlieties IIN vai MUN maksātāju (vai "SIA / kapitālsabiedrība" - skat. zemāk), ievadiet vārdu/nosaukumu, kodu, adresi, PVN Nr., IBAN un banku (tie parādās uz rēķiniem).
2. **Statusi:** atzīmējiet, kuri pasūtījumu statusi nozīmē "nauda saņemta" un kuri - atmaksu.
3. **Maksājumu veidi:** katram maksājuma veidam izvēlieties aili - Kase, Maksājumu konts (banka) vai Citi (PayPal, Stripe, kartes) - un, ja vajag, komisijas maksu (% + fiksēta summa).
4. **PVN maksātājs:** ja "Jā", PVN tiek ierakstīts 17. ailē, apgrozījumā - summa bez PVN. Ja "Nē", uz rēķina tiek rakstīts "Nav PVN maksātājs."
5. **Sākuma atlikumi:** ievadiet kases, konta un citu līdzekļu atlikumu gada sākumā (pārbaude brīdina, ja tie nav ievadīti).
6. **Automātiskais imports:** ieslēgts pēc noklusējuma - pasūtījums tiek ierakstīts brīdī, kad tas saņem apmaksātu statusu, un atmaksa - kad tas saņem atmaksas statusu. Poga "Ierakstīt žurnālā" ieraksta visu, kas vēl trūkst.

## Ieraksti netiek dzēsti (revīzijas izsekojamība)
- **Importētie ieraksti** (pasūtījumi, atmaksas, komisijas) ir aizsargāti 🔒 - tos nevar labot vai anulēt. Kļūdu labo ar **korekcijas ierakstu** (±): jauns ieraksts ar starpību, kas norāda uz oriģinālu.
- **Manuālos ierakstus** var labot (✎) vai **anulēt** (⊘) ar iemeslu. Anulēts ieraksts paliek žurnālā ar savu numuru, pārsvītrots, un netiek ieskaitīts summās.
- **Izmaiņu vēsture:** katra izmaiņa tiek saglabāta - kas, kad, vērtība pirms un pēc. Ieraksta detaļās (ⓘ) redzama tā vēsture.

## Rēķini un kredītrēķini
- Numerācija bez pārtraukumiem: `R-2026-00001`, kredītrēķini `KR-2026-00001` (sērijas maināmas). Datums nevar būt agrāks par sērijas pēdējo dokumentu.
- **Rēķins katram apmaksātam pasūtījumam** (iestatījumos) - tikai pasūtījumiem, kas apmaksāti pēc ieslēgšanas; var arī nosūtīt pircējam e-pastā (izmanto veikala e-pasta iestatījumus).
- **Manuāls rēķins:** cilne "Rēķini" → Jauns rēķins. Kad nauda saņemta - "Apmaksāts", un ieņēmumi tiek ierakstīti žurnālā.
- **Atmaksa** (↩ pie pasūtījuma ieraksta) - pilna vai daļēja; ja pasūtījumam ir rēķins, automātiski tiek izrakstīts kredītrēķins, kas atsaucas uz to.
- Rēķinu var atvērt, izdrukāt/saglabāt PDF un nosūtīt pircējam.

## CMR pavadzīmes (preču kustība)
Cilne **CMR** - starptautisko autopārvadājumu pavadzīmes:
- **Izejošās** (jūsu sūtītās preces): "CMR no rēķina / pasūtījuma" aizpilda nosūtītāju (jūsu rekvizīti), saņēmēju un piegādes adresi, preces un bruto svaru no produktiem. Numurs tiek piešķirts automātiski (`CMR-2026-00001`, sērija maināma iestatījumos), vai ierakstiet iespiestas CMR veidlapas numuru. Pie katra rēķina ir arī poga 🚚.
- **Ienākošās** (jums piegādātās preces): ievadiet numuru no dokumenta, pievienojiet skenējumu vai foto un piesaistiet žurnāla ierakstam ar piegādātāja rēķinu.
- Vienu CMR var piesaistīt vairākiem rēķiniem vai ierakstiem un otrādi; rēķinu sarakstā un ieraksta detaļās redzamas piesaistītās CMR.
- **Drukāt / PDF:** visas 24 ailes (latviski / angliski), izejošām - 3 eksemplāri (nosūtītājam, saņēmējam, pārvadātājam).
- **Krava saņemta (✓):** kad atgriežas parakstītais eksemplārs, atzīmējiet 24. ailes datumu un pievienojiet skenējumu. Pārbaude atgādina par izejošām CMR, kurām pēc 14 dienām nav atzīmēta saņemšana.
- CMR netiek dzēstas - kļūdainu anulē ar iemeslu; labojumi redzami izmaiņu vēsturē. CMR ir arī JSON eksportā.

CMR ir pārvadājuma dokuments, nevis grāmatvedības ieraksts - tas nemaina žurnāla summas.

## Izdevumi no čeka vai rēķina foto
**Žurnāls → 📷 Izdevumi no čeka / rēķina:** nofotografējiet vai izvēlieties JPG/PNG/PDF. Teksts tiek nolasīts pārlūkā šajā datorā - foto netiek sūtīts uz internetu un nav vajadzīga AI atslēga. Aizpildās datums, dokumenta Nr., piegādātājs, summa un PVN; pārbaudiet un saglabājiet. Fails tiek saglabāts kā attaisnojuma dokuments 📎.

Lasīšanas programma (~6 MB) pirmajā reizē tiek ielādēta no jsDelivr CDN un pēc tam glabājas pārlūka kešatmiņā. Ja vēlaties to turēt savā serverī, skat. `optional/README.txt`.

## Attaisnojuma dokumenti
Katram ierakstam var pievienot foto vai PDF (līdz 15 MB). Faili tiek glabāti aizsargātā mapē `storage/lv_journal_docs/` (nav pieejami no interneta), ar kontrolsummu, un tos nevar izdzēst no moduļa.

## Termiņi un atgādinājumi
Cilnē **Pārskats** – tuvākie deklarāciju un maksājumu termiņi, ar atzīmi „Iesniegts” (un EDS numuru). Termiņi izriet no nodokļu režīma un PVN statusa; ja termiņš ir brīvdienā vai svētku dienā, tas pārcelts uz nākamo darba dienu:
- **Gada ienākumu deklarācija** – no 1. marta līdz 1. jūnijam (līdz 1. jūlijam, ja iepriekšējā gada ienākumi pārsniedz 78 100 €); nodoklis jāsamaksā līdz 23. jūnijam.
- **Pašnodarbinātā ziņojums par VSAOI** (IIN maksātājiem) – par ceturksni līdz nākamā mēneša 17. datumam, samaksa līdz 23. datumam; ja ceturksnī nebija ienākumu, ziņojums nav jāiesniedz.
- **Mikrouzņēmumu nodokļa deklarācija** (MUN maksātājiem) – līdz ceturksnim sekojošā mēneša 15. datumam, samaksa līdz 23. datumam; tikai ceturkšņos ar apgrozījumu.
- **PVN deklarācija** (PVN maksātājiem) – līdz nākamā mēneša 20. datumam, samaksa līdz 23. datumam; periods (mēnesis vai ceturksnis) – iestatījumos.

**Atgādinājumi pa e-pastu** (Iestatījumi → Termiņi un atgādinājumi): norādītās dienas pirms termiņa un vēlreiz, ja termiņš nokavēts. Tiek izmantoti veikala e-pasta iestatījumi; adrese – norādītā, citādi uzņēmuma, citādi veikala e-pasts. Pārbaude notiek, atverot moduli vai kad mainās pasūtījuma statuss, ne biežāk kā reizi dienā. Kad deklarācija iesniegta, atzīmējiet to – atgādinājumi par to beidzas.

## E-rēķini (strukturētie rēķini)
- Pie katra rēķina poga **XML**: strukturētais e-rēķins Peppol BIS Billing 3.0 / EN 16931 (UBL 2.1) formātā. Valsts un pašvaldību iestādēm tie ir obligāti jau tagad, PVN maksātājiem savā starpā – no 2028. gada 1. janvāra.
- E-rēķinu var sagatavot tikai pircējam uzņēmumam (ar reģistrācijas numuru vai PVN numuru); patērētājiem tas nav vajadzīgs. Pircēja valsti un atsauci (līgums, pasūtījums) var norādīt rēķinā.
- Failu nosūtiet caur valsts e-adresi vai e-rēķinu pakalpojuma sniedzēju (modulis pats nesūta).
- Faili pārbaudīti ar oficiālajiem CEN EN 16931 un Peppol noteikumiem (bez kļūdām).

## Dati grāmatvedim
Iestatījumi → "Dati grāmatvedim": viens ZIP fails gadam (ar jūsu paroli) – žurnāls un grāmatojumi (CSV), rēķini (HTML), e-rēķini (XML) un pievienotie čeki (līdz 60 MB). CSV faili atveras Excel un importējami Jumis, Horizon, Zalktis, 1C ar to CSV/Excel importu.

## Ko darīt tagad un iestatīšanas vednis
- Pārskata augšā – saraksts "Ko darīt tagad": nokavētie un tuvākie termiņi, neapmaksātie rēķini, pārbaužu problēmas, periods, ko var slēgt, un datu kopija.
- Pirmajā reizē atveras **iestatīšanas vednis** (uzņēmums no reģistriem, konts, atgādinājumi); vēlāk – Iestatījumi → "Iestatīšanas vednis".

## Programmatūras licence
Iestatījumi → "Programmatūras licence": ievadiet OpenCart Marketplace pasūtījuma numuru un datumu un izdrukājiet **lietošanas tiesību apliecinājumu** (MK noteikumi Nr. 877, 56.1. apakšpunkts) ar atbilstību 57. punkta prasībām. Pievienojiet to grāmatvedības organizācijas dokumentiem (60.1. apakšpunkts) kopā ar pirkuma apliecinājumu. Licences līgums ir modulī (LICENCE.txt) un apliecinājumā; apliecinājums ir arī ZIP failā "Dati grāmatvedim".

## Drošība
- **Slēgtie periodi** (Iestatījumi): pēc deklarācijas iesniegšanas slēdziet periodu – šī perioda ierakstus un rēķinus vairs nevar pievienot, labot vai anulēt; automātiski ieraksti nonāk pirmajā atvērtajā dienā. Atvērt periodu var tikai ar iemeslu un savu OpenCart paroli.
- **Piekļuve** (Iestatījumi): katram administratoram – pilna piekļuve, tikai skatīt vai nav piekļuves. Izmaiņām vajag jūsu paroli.
- **Datu kopija** (Iestatījumi): visu moduļa datu kopija JSON failā (ar paroli).
- **Konta izraksts → ieraksti**: izraksta rindas, kuru nav žurnālā, var ierakstīt uzreiz (rēķina apmaksa vai jauns ieraksts pēc noteikuma); katru rindu tikai vienu reizi.

## Pārbaudes (cilne "Pārskats")
- vai visi apmaksātie pasūtījumi ir žurnālā un katrai atmaksai ir atmaksas ieraksts;
- pasūtījumi, kas pēc apmaksas mainīja statusu bez atmaksas;
- vai ievadīti sākuma atlikumi;
- bezskaidras naudas ieraksti, kas nav salīdzināti ar konta izrakstu (12. p.), un datumu nesakritības;
- izdevumi bez attaisnojuma dokumenta;
- **sliekšņi:** PVN reģistrācija 50 000 € gadā (ja neesat PVN maksātājs) un ES OSS 10 000 € (tālpārdošana patērētājiem citās ES valstīs).

## Konta izraksts (12. punkts)
Cilne "Konta izraksts": augšupielādējiet bankas izrakstu ISO 20022 **camt.053 XML** formātā (to piedāvā visas Latvijas bankas). Izraksta rindas tiek savienotas ar žurnāla ierakstiem pēc summas, datuma un rēķina/pasūtījuma numura. Apstiprinot var pārcelt ieraksta datumu uz izraksta datumu.

## 3. pielikums
IIN maksātājiem: cilne "3. pielikums" - izdevumu precizēšanas reģistrs. 1. rinda tiek ņemta no žurnāla, 2.-6. rindu ievadāt, 7. rinda tiek aprēķināta (1 − 2 + 3 + 4 − 5 + 6).

## Valūta (14. punkts)
Pasūtījumi citā valūtā tiek pārrēķināti eiro pēc ECB kursa, ko publicē Latvijas Banka un kas ir spēkā darījuma dienas sākumā. Ja kursu nevar iegūt, tiek izmantots veikala kurss, un pārbaude par to brīdina.

## Eksports grāmatvedim
- **Drukāt / PDF:** oficiālā ailu izkārtojumā, katrs mēnesis savā lapā (A4 ainava).
- **CSV (Excel):** visas ailes.
- **Grāmatojumi:** divkāršā ieraksta CSV (debets/kredīts pēc kontu plāna, kontus var mainīt iestatījumos).
- **JSON / API:** Iestatījumi → izveidojiet atslēgu; grāmatvedis vai cita sistēma var nolasīt gada datus (ieraksti, rēķini, dokumenti, 3. pielikums): `https://jūsu-veikals/index.php?route=...feed&year=2026` ar galveni `Authorization: Bearer <atslēga>`. Precīza adrese redzama iestatījumos.

## SIA un citas kapitālsabiedrības
MK noteikumi Nr. 322 attiecas uz fiziskām personām un individuālajiem komersantiem (1. punkts). SIA kārto divkāršo ierakstu - izvēlieties "SIA / kapitālsabiedrība": rēķini, dokumenti un pārbaudes darbojas, un grāmatvedim nododiet **Grāmatojumu CSV** vai JSON.

## Svarīgi
Rīks palīdz kārtot žurnālu, bet neaizstāj grāmatvedi. Pārbaudiet ierakstus pirms deklarācijas iesniegšanas. Atinstalējot moduli, žurnāla ieraksti, rēķini, dokumenti un vēsture netiek dzēsti.
