package ExempleManolache.main;

import cts.manolache.mihaiandrei.g1086.adapter.*;
import cts.manolache.mihaiandrei.g1086.builder.FoodItem;
import cts.manolache.mihaiandrei.g1086.builder.FoodItemBuilderV2;
import cts.manolache.mihaiandrei.g1086.composite.EmailAddress;
import cts.manolache.mihaiandrei.g1086.composite.EmailGroup;
import cts.manolache.mihaiandrei.g1086.decorator.Car;
import cts.manolache.mihaiandrei.g1086.decorator.CarWithAlarm;
import cts.manolache.mihaiandrei.g1086.decorator.CarWithSportSeats;
import cts.manolache.mihaiandrei.g1086.facade.CarCockpit;
import cts.manolache.mihaiandrei.g1086.factory.RestAPI;
import cts.manolache.mihaiandrei.g1086.factory.RestApiFactory;
import cts.manolache.mihaiandrei.g1086.flyweight.CustomCharacter;
import cts.manolache.mihaiandrei.g1086.flyweight.CustomCharacterFactory;
import cts.manolache.mihaiandrei.g1086.flyweight.Position;
import cts.manolache.mihaiandrei.g1086.flyweight.TextCharacter;
import cts.manolache.mihaiandrei.g1086.prototype.BuildingBlock;
import cts.manolache.mihaiandrei.g1086.prototype.WoodBlock;
import cts.manolache.mihaiandrei.g1086.proxy.AuthenticationProxy;
import cts.manolache.mihaiandrei.g1086.proxy.AuthenticationService;
import cts.manolache.mihaiandrei.g1086.proxy.WebSiteAuthentication;
import cts.manolache.mihaiandrei.g1086.proxy.exceptions.TooManyBadLoginsException;
import cts.manolache.mihaiandrei.g1086.singleton.Logger;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //proxy
        //Interconectarea de API-uri diferite aflate pe aceeași mașină sau în rețea
        //Definirea unei interfețe între framework-uri diferite
        Scanner scanner = new Scanner(System.in);
        AuthenticationService authenticationService = new AuthenticationProxy(new WebSiteAuthentication());

        boolean isValidLogin = false;
        while(!isValidLogin) {
            System.out.println("username: ");
            String username = scanner.nextLine();

            System.out.println("password: ");
            String password = scanner.nextLine();

            try {
                isValidLogin = authenticationService.login(username, password);
            } catch (TooManyBadLoginsException e) {
                System.out.println("Too many bad logins");
                break;
            }
            System.out.println(isValidLogin ? "Succes" : "Denied");
        }
        //proxy

        //flyweight
        /*
        ACME Inc. dezvoltă un editor de texte ca soluție alternativă la soluțiile cunoscute. În
        faza de testare s-a observat ca pe măsură ce crește dimensiunea textului, crește și
        memoria ocupată de această aplicația. Ritmul de creștere este unul anormal, destul de
        rapid , iar în final generează întârzieri între momentul tastării unui caracter și cel al
        afișării. Teste pe această zonă au arătat că există o legătură între numărul de caractere
        tastate și numărul de obiecte.
         */
        CustomCharacterFactory customCharacterFactory = new CustomCharacterFactory();
        TextCharacter textCharacterA = customCharacterFactory.getCharacter('a');
        textCharacterA.display((new Position(1,2)));
        TextCharacter textCharacterB = customCharacterFactory.getCharacter('b');
        textCharacterB.display((new Position(1,3)));
        TextCharacter textCharacterA1 = customCharacterFactory.getCharacter('a');
        CustomCharacter customCharacter = (CustomCharacter) textCharacterA1;
        customCharacter.setSize(14);
        textCharacterA1.display((new Position(1,4)));
        textCharacterA.display((new Position(1,2)));
        //flyweight

        //facade
        /*
        ACME Inc. dezvoltă o soluție software pentru managementul unei locuințe inteligente.
        Includerea în framework a tuturor componentelor controlabile dintr-o astfel de
        locuință (ferestre, încălzire, alarma, etc) a generat un număr mare de clase.
        Departamentul care dezvolta interfața web a soluției oferă un set minim de funcții ce
        pot fi controlate de la distanță. Deși funcționalitatea este simplă, numărul mare de
        clase ce se instanțiază și a metodelor apelate îngreunează dezvoltarea și testarea. În
        acest sens, o interfață mai simplă ar ajuta acest departament.
         */
        CarCockpit carCockpit = new CarCockpit();
        carCockpit.brake();
        carCockpit.accelerate();
        carCockpit.resetTemperature();
        carCockpit.displayTemperature();
        //facade

        //decorator
        /*
        ● Extinderea (decorarea) statică sau la run-time a funcționalității sau stării unor
        obiecte, independent de alte instanțe ale aceleiași clase
        ● Obiectul poate să fie extins prin aplicarea mai multor decoratori
        ● Clasa existentă nu trebuie să fie modificata
        ● Utilizarea unei abordări tradiționale, prin derivarea clasei, duce la ierarhii
        complexe ce sunt greu de gestionat. Derivarea adaugă comportament nou doar
        la compilare
        */
        Car car = new Car();
        car.start();

        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.pressAlarmButton();
        carWithAlarm.stop();

        CarWithSportSeats carWithSportSeats = new CarWithSportSeats(carWithAlarm);
        carWithSportSeats.setSeatsProducer("Recaro");
        //decorator

        //composite
        /*
        ACME Inc. dezvoltă o soluție software pentru managementul resurselor umane
        dintr-o companie. Soluția trebuie să ofere un mecanism unitar care să centralizeze
        angajații companiei și care să țină cont de:
        ● relațiile ierarhice
        ● apartenența angajaților la un departament
        ● rolurile diferite ale angajaților
        ● setul comun de funcții pe care un angajat le poate îndeplini
         */
        EmailGroup seriaD = new EmailGroup();
        EmailGroup grupa1084 = new EmailGroup();
        EmailGroup grupa1085 = new EmailGroup();
        EmailAddress student1 = new EmailAddress("dana.georgescu@csie.ro");
        EmailAddress student2 = new EmailAddress("andra.enache@csie.ro");
        EmailAddress student3 = new EmailAddress("ionel.popescu@csie.ro");

        grupa1084.addReceiver(student1);
        grupa1084.addReceiver(student2);
        grupa1085.addReceiver(student3);

        seriaD.addReceiver(grupa1084);
        seriaD.addReceiver(grupa1085);

        seriaD.receive("salutare");
        //composite

        //adapter
        /*
        ACME Inc. dorește să cumpere un nou framework pentru serviciile din back-end.
        Interfața pentru aceste servicii gestionează datele prin intermediul obiectelor de tip
        ACME, iar noul framework procesează datele prin intermediul obiectelor de tip
        MICRO. Programatorii companiei trebuie sa găsească o soluție de a integra cele doua
        framework-uri fără a le modifica
         */
        AbstractTrainTicketBooking trainTicketBooking = new TrainTicketBooking();
        BusTicketBooking busTicketBooking = new BusTicketBooking(30);
        boolean result = trainTicketBooking.reserveSeat(1, 1);
        System.out.println(result);

        //Class adapter
        trainTicketBooking = new BusToTrainClassAdapter(30);

        result = trainTicketBooking.reserveSeat(1, 1);
        System.out.println(result);

        //Object adapter
        trainTicketBooking = new BusToTrainObjectAdapter(busTicketBooking);

        result = trainTicketBooking.reserveSeat(2, 2);
        System.out.println(result);
        //adapter

        //builder
        /*
        ● Soluția trebuie să construiască obiecte complexe printr-un mecanism care este
        independent de procesul de realizare a obiectelor
        ● Clientul construiește obiectele complexe specificând doar tipul și valoarea sa,
        fără a cunoaște detaliile interne ale obiectului (cum stochează și reprezintă
        valorile)
        ● Procesul de construire a obiectelor trebuie să poată fi utilizat pentru a defini
        obiecte diferite din aceeași familie
        ● Obiectele sunt gestionate prin interfața comună
        ● Instanța de tip Builder construiește obiectul însă tipul acestuia este definit de
        subclase
         */

        FoodItem pizza = new FoodItem.FoodItemBuilder().addName("Salam").addPrice(22).addExpirationDate(LocalDate.now().plusDays(1)).build();
        System.out.println(pizza);

        FoodItem burger = new FoodItemBuilderV2().addName("Cheesburger").addPrice(12).addProducer("McDonalds").setIsVegan(false).build();
        System.out.println(burger);
        //builder

        //prototype
        /*
        ACME Inc. dorește să dezvolte un joc 3D pentru dispozitive Android utilizând un
        engine propriu. Cele 2 modele 3D pentru caractere sunt destul de complexe și
        generarea lor are impact asupra timpului de procesare și implicit asupra duratei de
        viață a acumulatorului. Același model este utilizat de mai multe ori pentru a popula o
        scena cu personaje. Trebuie găsită o soluție eficientă prin care scenele să fie
        încărcate rapid.
         */
        BuildingBlock block1 = new WoodBlock();
        block1.setX(0);
        block1.setY(0);
        block1.setZ(0);
        block1.render();

        BuildingBlock block2 = null;
        if (block1 instanceof Cloneable) {
            try {
                block2 = (BuildingBlock) block1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            block2.setX(1);
            block2.setY(1);
            block2.setZ(1);
            block2.render();
        }
        //prototype

        //factory
        /*
        ○ Pattern ce defineste o metodă pentru crearea de obiecte din aceeași familie de
        clase (subclase)
         */
        RestApiFactory restApiFactory = new RestApiFactory();
        RestAPI api = restApiFactory.getInstance("development");
        api.connect();
        //factory

        //singleton
        /*
        ● Se dorește crearea unei singure instanțe pentru o clasă prin care să
        fie gestionată o resursă/un eveniment în mod centralizat
        ● Soluția se bazează pe existența unei singure instanțe ce poate fi
        creata o singură dată dar care poate fi referită de mai multe ori
        ● Asigură un singur punct de acces, vizibil global, la unică instanță
        ● Exemple: gestiune conexiune baze de date sau alte resurse;
        mecanism de logging unic; manager evenimente; manager resurse
        vizuale; manager configurare.
         */
        Logger logger = Logger.getInstance();
        logger.log("Hello world!");
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Something");
        //singleton
    }
}
