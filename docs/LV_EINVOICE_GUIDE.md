# Lastadia E-rēķini - lietošanas instrukcija (v1.0.1)

Strukturētie e-rēķini Latvijas OpenCart veikalam: rēķini un kredītrēķini ar nepārtrauktu numerāciju un e-rēķina XML fails (Peppol BIS Billing 3.0 / EN 16931, UBL 2.1) katram rēķinam uzņēmumam. Bez grāmatvedības - grāmatvedību var kārtot jūsu grāmatvedis savā programmā (Jumis, Horizon u. c.).

## Kāpēc
- Valsts un pašvaldību iestādēm e-rēķini ir obligāti jau tagad.
- PVN maksātājiem savā starpā Latvijā - no 2028. gada 1. janvāra; brīvprātīgi - jau tagad.
- Patērētājiem e-rēķins nav vajadzīgs.

## Uzstādīšana
1. OpenCart 3: Extensions → Installer → `lv_einvoice_oc3.ocmod.zip`; Extensions → Modules → "Lastadia E-rēķini" → Install. OpenCart 4: Extensions → Installer → `lv_einvoice.ocmod.zip` → Install, tad Extensions → Modules → Install.
2. Izvēlne: Sales → E-rēķini.
3. Cilnē **Uzņēmums** ievadiet reģistrācijas numuru - nosaukums, adrese un PVN statuss tiek atrasti reģistros. E-rēķinam vajag reģistrācijas numuru (11 cipari) vai PVN numuru.
4. Iestatījumos - konts (IBAN), rēķinu sērijas, apmaksas termiņš; vajadzības gadījumā - automātiski rēķini katram apmaksātam pasūtījumam.

## Rēķini
- **+ Rēķins** - pircējs (nosaukums, reģistrācijas Nr., PVN Nr., valsts, atsauce), rindas ar daudzumu, mērvienību, cenu un PVN likmi. PVN maksātājam, ja likme 0 %, - iemesls: apgrieztā maksāšana, preces citas ES valsts PVN maksātājam, eksports, atbrīvots.
- **+ Rēķins pasūtījumam** - no pasūtījuma; uzņēmuma rekvizītus (reģ. Nr., PVN Nr.) var ievadīt izrakstot.
- **Automātiski rēķini** - ja ieslēgti, katram pasūtījumam, kas apmaksāts pēc ieslēgšanas dienas (vecākiem pasūtījumiem rēķini atpakaļejoši netiek izrakstīti).
- Izrakstītu rēķinu nevar mainīt vai dzēst - kļūdu labo ar kredītrēķinu.

## E-rēķini
- Pie rēķina poga **XML** - e-rēķina fails. Ja e-rēķinu nevar sagatavot (piem. pircējam nav reģistrācijas vai PVN numura), modulis parāda iemeslu.
- Pārskatā **E-rēķini par periodu** - visi perioda e-rēķini vienā ZIP failā ar sarakstu (rēķiniem bez e-rēķina - iemesls).
- Failu nosūtiet pircējam caur valsts e-adresi vai e-rēķinu pakalpojuma sniedzēju; modulis pats nesūta.
- Faili pārbaudīti ar oficiālajiem CEN EN 16931 un Peppol noteikumiem (bez kļūdām).

## Drošība
- Slēgtie periodi, piekļuve katram administratoram, izmaiņu vēsture, pilna datu kopija (Iestatījumi).

Rīks palīdz izrakstīt rēķinus, bet nav juridisks vai nodokļu padoms. Par rēķinu saturu atbild izrakstītājs.
