# Saimnieciskās darbības žurnāls - lietošanas instrukcija (v1.1.0)

Ieņēmumu un izdevumu uzskaites žurnāls vienkāršā ieraksta sistēmā, aizpildīts automātiski no apmaksātiem pasūtījumiem. Formāts atbilst MK noteikumiem Nr. 322 par grāmatvedību vienkāršā ieraksta sistēmā (likumi.lv/ta/id/332883): **1. pielikums** (IIN maksātāji, 24 ailes), **2. pielikums** (MUN maksātāji, 15 ailes) un **3. pielikums** (izdevumu precizēšanas reģistrs).

Moduļa valoda: latviešu, angļu vai krievu (Iestatījumi → Moduļa valoda). Žurnāla izdruka un rēķini vienmēr ir latviešu valodā.

## Prasības
- OpenCart 3.0.x vai 4.0.x / 4.1.x (pārbaudīts ar 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4)
- Veikalā jābūt valūtai EUR

## Uzstādīšana
**OpenCart 3:** Extensions > Installer → augšupielādējiet `lv_journal_oc3.ocmod.zip` → Extensions > Extensions > Modules → "Saimnieciskās darbības žurnāls (LV)" → Install.
**OpenCart 4:** Extensions > Installer → augšupielādējiet `lv_journal.ocmod.zip` (nemainiet faila nosaukumu) → Install → Extensions > Extensions > Modules → Install.
Modulis atrodams izvēlnē **Reports > Saimn. darbības žurnāls**.

**Atjaunināšana no 1.0:** OpenCart 3 - vienkārši augšupielādējiet jauno zip. OpenCart 4 - Extensions > Installer, pie vecās versijas spiediet Uninstall (tikai faili, ne modulis), tad augšupielādējiet un instalējiet jauno. Žurnāla dati paliek; esošie importētie ieraksti tiek aizsargāti automātiski.

## Pirmie soļi
1. **Iestatījumi:** izvēlieties IIN vai MUN maksātāju (vai "SIA / kapitālsabiedrība" - skat. zemāk), ievadiet vārdu/nosaukumu, kodu, adresi, PVN Nr., IBAN un banku (tie parādās uz rēķiniem).
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

## Izdevumi no čeka vai rēķina foto
**Žurnāls → 📷 Izdevumi no čeka / rēķina:** nofotografējiet vai izvēlieties JPG/PNG/PDF. Teksts tiek nolasīts pārlūkā šajā datorā - foto netiek sūtīts uz internetu un nav vajadzīga AI atslēga. Aizpildās datums, dokumenta Nr., piegādātājs, summa un PVN; pārbaudiet un saglabājiet. Fails tiek saglabāts kā attaisnojuma dokuments 📎.

Lasīšanas programma (~6 MB) pirmajā reizē tiek ielādēta no jsDelivr CDN un pēc tam glabājas pārlūka kešatmiņā. Ja vēlaties to turēt savā serverī, skat. `optional/README.txt`.

## Attaisnojuma dokumenti
Katram ierakstam var pievienot foto vai PDF (līdz 15 MB). Faili tiek glabāti aizsargātā mapē `storage/lv_journal_docs/` (nav pieejami no interneta), ar kontrolsummu, un tos nevar izdzēst no moduļa.

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
