import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRunner {
    
    public static void main(String[] args) {
        
        Competition competition = new Competition();
        List<CommitteeMember> cmList = new ArrayList<CommitteeMember>();
        List<Competitor> competitorList = new ArrayList<Competitor>();
        //Used only for search
        List<Event> eventList = competition.getEvents();
        
        
        //Male events
        competition.setEvent(new Event("Pommel Horse","This is Pommel Horse event", "09:00 a.m. 8th June","Male"));
        competition.setEvent(new Event("Still Rings", "This is Still Rings event", "10:00 a.m. 8th June","Male"));
        competition.setEvent(new Event("Parallel Bars", "This is Parallel Bars event", "11:00 a.m. 8th June","Male"));
        competition.setEvent(new Event("High Bar", "This is High Bar event", "12:00 a.m. 8th June","Male"));
        competition.setEvent(new Event("Floor Exercise", "This is Floor Exercise event", "1:00 p.m. 8th June","Male"));
        competition.setEvent(new Event("Vault", "This is Vault event", "2:00 p.m. 8th June","Male"));
         
        
        //Female events
        competition.setEvent(new Event("Uneven Bars", "This is Uneven Bars event", "3:00 p.m. 8th June","Female"));
        competition.setEvent(new Event("Balance Beams", "This is Balance Beams event", "4:00 p.m. 8th June","Female"));
        competition.setEvent(new Event("Floor Exercise", "This is Floor Exercise event", "5:00 p.m. 8th June","Female"));
        competition.setEvent(new Event("Vault", "This is Vault event", "6:00 p.m. 8th June","Female"));
             
        
        //Add committee members and their associated events
        CommitteeMember quentin_tarantino = new CommitteeMember("Quentin Tarantino");
        quentin_tarantino.addEventsOrganized(competition.getEvents().get(0));
        quentin_tarantino.addEventsOrganized(competition.getEvents().get(9));
        cmList.add(quentin_tarantino);
       
        CommitteeMember james_cameron = new CommitteeMember("James Cameron");
        james_cameron.addEventsOrganized(competition.getEvents().get(1));
        cmList.add(james_cameron);

        CommitteeMember steven_spielberg = new CommitteeMember("Steven Spielberg");
        steven_spielberg.addEventsOrganized(competition.getEvents().get(2));
         steven_spielberg.addEventsOrganized(competition.getEvents().get(8));
        cmList.add(steven_spielberg);

        CommitteeMember martin_scorsese = new CommitteeMember("Martin Scorsese");
        martin_scorsese.addEventsOrganized(competition.getEvents().get(3));
        cmList.add(martin_scorsese);

        CommitteeMember tim_burton = new CommitteeMember("Tim Burton");
        tim_burton.addEventsOrganized(competition.getEvents().get(4));
        cmList.add(tim_burton);

        CommitteeMember chris_nolan = new CommitteeMember("Chris Nolan");
        chris_nolan.addEventsOrganized(competition.getEvents().get(5));
        cmList.add(chris_nolan);

        CommitteeMember patty_jenkins = new CommitteeMember("Patty Jenkins");
        patty_jenkins.addEventsOrganized(competition.getEvents().get(6));
        patty_jenkins.addEventsOrganized(competition.getEvents().get(8));
        cmList.add(patty_jenkins);

        CommitteeMember mary_harron = new CommitteeMember("Mary Harron");
        mary_harron.addEventsOrganized(competition.getEvents().get(7));
        cmList.add(mary_harron);

        CommitteeMember julie_dash = new CommitteeMember("Julie Dash");
        julie_dash.addEventsOrganized(competition.getEvents().get(2));
        cmList.add(julie_dash);

        CommitteeMember sarah_polley = new CommitteeMember("Sarah Polley");
        sarah_polley.addEventsOrganized(competition.getEvents().get(5));
        sarah_polley.addEventsOrganized(competition.getEvents().get(9));
        cmList.add(sarah_polley);
       
        
        //Routines
        Routine pommel_horse = new Routine("Single leg swings, Scissors, Circles, Flairss, Side support travel, Dismounts","High Difficulity");
        Routine still_rings = new Routine(" Pull-ups, Dips, Bodyweight Rows, Push-ups, Bicep Curls","Medium Difficulity");
        Routine parallel_bars = new Routine("Swinging in support position, Swinging in upper arm position, Swinging in a hanging position, Static Hold, Dismount","Easy Difficulity");
        Routine high_bar = new Routine("Giants, Flips, Twists, Turns, Release-Travel-Regrasp, Dismount","Medium Difficulity");
        Routine floor_exercise = new Routine("Back Handspring, Front Handspring, Back Walkover, Somersault, Cartwheel","High Difficulity");
        Routine vault = new Routine("Running leap, Front handspring, Landing","Easy Difficulity");
        Routine uneven_bars = new Routine("Salto forward, Seat circle forward, Tucked jaeger, Stalder hecht","Medium Difficulity");
        Routine balance_beams = new Routine("Thief vault, Cartwheel, Back extension, Illusion turn, Stag leap, Front salto tucked","High Difficulity");

        
        //Male attemps
        Attempt competitor1_event1 = new Attempt(pommel_horse,7);
        competitor1_event1.setevent(competition.getEvents().get(0));
        Attempt competitor1_event2 = new Attempt(still_rings,8);
        competitor1_event2.setevent(competition.getEvents().get(1));

        Attempt competitor2_event1 = new Attempt(parallel_bars,9);
        competitor2_event1.setevent(competition.getEvents().get(2));
        Attempt competitor2_event2 = new Attempt(high_bar,6);
        competitor2_event2.setevent(competition.getEvents().get(3));

        Attempt competitor3_event1 = new Attempt(floor_exercise,8);
        competitor3_event1.setevent(competition.getEvents().get(4));
        Attempt competitor3_event2 = new Attempt(vault,7);
        competitor3_event2.setevent(competition.getEvents().get(5));

        Attempt competitor4_event1 = new Attempt(pommel_horse,3);
        competitor4_event1.setevent(competition.getEvents().get(0));
        Attempt competitor4_event2 = new Attempt(still_rings,9);
        competitor4_event2.setevent(competition.getEvents().get(1));

        Attempt competitor5_event1 = new Attempt(parallel_bars,6);
        competitor5_event1.setevent(competition.getEvents().get(2));
        Attempt competitor5_event2 = new Attempt(high_bar,3);
        competitor5_event2.setevent(competition.getEvents().get(3));

        Attempt competitor6_event1 = new Attempt(floor_exercise,4);
        competitor6_event1.setevent(competition.getEvents().get(4));
        Attempt competitor6_event2 = new Attempt(vault,8);
        competitor6_event2.setevent(competition.getEvents().get(5));

        Attempt competitor7_event1 = new Attempt(pommel_horse,9);
        competitor7_event1.setevent(competition.getEvents().get(0));
        Attempt competitor7_event2 = new Attempt(still_rings,5);
        competitor7_event2.setevent(competition.getEvents().get(1));

        Attempt competitor8_event1 = new Attempt(parallel_bars,6);
        competitor8_event1.setevent(competition.getEvents().get(2));
        Attempt competitor8_event2 = new Attempt(high_bar,6);
        competitor8_event2.setevent(competition.getEvents().get(3));

        Attempt competitor9_event1 = new Attempt(floor_exercise,8);
        competitor9_event1.setevent(competition.getEvents().get(4));
        Attempt competitor9_event2 = new Attempt(vault,2);
        competitor9_event2.setevent(competition.getEvents().get(5));

        Attempt competitor10_event1 = new Attempt(pommel_horse,3);
        competitor10_event1.setevent(competition.getEvents().get(0));
        Attempt competitor10_event2 = new Attempt(still_rings,4);
        competitor10_event2.setevent(competition.getEvents().get(1));

        Attempt competitor11_event1 = new Attempt(parallel_bars,9);
        competitor11_event1.setevent(competition.getEvents().get(2));
        Attempt competitor11_event2 = new Attempt(high_bar,6);
        competitor11_event2.setevent(competition.getEvents().get(3));

        Attempt competitor12_event1 = new Attempt(floor_exercise,7);
        competitor12_event1.setevent(competition.getEvents().get(4));
        Attempt competitor12_event2 = new Attempt(vault,9);
        competitor12_event2.setevent(competition.getEvents().get(5));

        Attempt competitor13_event1 = new Attempt(pommel_horse,8);
        competitor13_event1.setevent(competition.getEvents().get(0));
        Attempt competitor13_event2 = new Attempt(still_rings,8);
        competitor13_event2.setevent(competition.getEvents().get(1));

        Attempt competitor14_event1 = new Attempt(parallel_bars,9);
        competitor14_event1.setevent(competition.getEvents().get(2));
        Attempt competitor14_event2 = new Attempt(high_bar,7);
        competitor14_event2.setevent(competition.getEvents().get(3));

        Attempt competitor15_event1 = new Attempt(floor_exercise,5);
        competitor15_event1.setevent(competition.getEvents().get(4));
        Attempt competitor15_event2 = new Attempt(vault,4);
        competitor15_event2.setevent(competition.getEvents().get(5));

        Attempt competitor16_event1 = new Attempt(pommel_horse,4);
        competitor16_event1.setevent(competition.getEvents().get(0));
        Attempt competitor16_event2 = new Attempt(still_rings,9);
        competitor16_event2.setevent(competition.getEvents().get(1));

        Attempt competitor17_event1 = new Attempt(parallel_bars,7);
        competitor17_event1.setevent(competition.getEvents().get(2));
        Attempt competitor17_event2 = new Attempt(high_bar,7);
        competitor17_event2.setevent(competition.getEvents().get(3));

        Attempt competitor18_event1 = new Attempt(floor_exercise,8);
        competitor18_event1.setevent(competition.getEvents().get(4));
        Attempt competitor18_event2 = new Attempt(vault,1);
        competitor18_event2.setevent(competition.getEvents().get(5));

        Attempt competitor19_event1 = new Attempt(pommel_horse,8);
        competitor19_event1.setevent(competition.getEvents().get(0));
        Attempt competitor19_event2 = new Attempt(still_rings,2);
        competitor19_event2.setevent(competition.getEvents().get(1));

        Attempt competitor20_event1 = new Attempt(parallel_bars,7);
        competitor20_event1.setevent(competition.getEvents().get(2));
        Attempt competitor20_event2 = new Attempt(high_bar,9);
        competitor20_event2.setevent(competition.getEvents().get(3));
       
        
        //Female attempts
        Attempt competitor21_event1 = new Attempt(floor_exercise,4);
        competitor21_event1.setevent(competition.getEvents().get(8));
        Attempt competitor21_event2 = new Attempt(vault,8);
        competitor21_event2.setevent(competition.getEvents().get(9));

        Attempt competitor22_event1 = new Attempt(uneven_bars,9);
        competitor22_event1.setevent(competition.getEvents().get(6));
        Attempt competitor22_event2 = new Attempt(balance_beams,5);
        competitor22_event2.setevent(competition.getEvents().get(7));

        Attempt competitor23_event1 = new Attempt(floor_exercise,6);
        competitor23_event1.setevent(competition.getEvents().get(8));
        Attempt competitor23_event2 = new Attempt(vault,6);
        competitor23_event2.setevent(competition.getEvents().get(9));

        Attempt competitor24_event1 = new Attempt(uneven_bars,8);
        competitor24_event1.setevent(competition.getEvents().get(6));
        Attempt competitor24_event2 = new Attempt(balance_beams,2);
        competitor24_event2.setevent(competition.getEvents().get(7));
        Attempt competitor24_event3 = new Attempt(vault,2);
        competitor24_event3.setevent(competition.getEvents().get(9));

        Attempt competitor25_event1 = new Attempt(floor_exercise,3);
        competitor25_event1.setevent(competition.getEvents().get(8));
        Attempt competitor25_event2 = new Attempt(vault,4);
        competitor25_event2.setevent(competition.getEvents().get(9));

        Attempt competitor26_event1 = new Attempt(uneven_bars,9);
        competitor26_event1.setevent(competition.getEvents().get(6));
        Attempt competitor26_event2 = new Attempt(balance_beams,6);
        competitor26_event2.setevent(competition.getEvents().get(7));

        Attempt competitor27_event1 = new Attempt(floor_exercise,7);
        competitor27_event1.setevent(competition.getEvents().get(8));
        Attempt competitor27_event2 = new Attempt(vault,9);
        competitor27_event2.setevent(competition.getEvents().get(9));

        Attempt competitor28_event1 = new Attempt(uneven_bars,8);
        competitor28_event1.setevent(competition.getEvents().get(6));
        Attempt competitor28_event2 = new Attempt(balance_beams,8);
        competitor28_event2.setevent(competition.getEvents().get(7));

        Attempt competitor29_event1 = new Attempt(floor_exercise,9);
        competitor29_event1.setevent(competition.getEvents().get(8));
        Attempt competitor29_event2 = new Attempt(vault,7);
        competitor29_event2.setevent(competition.getEvents().get(9));

        Attempt competitor30_event1 = new Attempt(uneven_bars,5);
        competitor30_event1.setevent(competition.getEvents().get(6));
        Attempt competitor30_event2 = new Attempt(balance_beams,4);
        competitor30_event2.setevent(competition.getEvents().get(7));

        Attempt competitor31_event1 = new Attempt(floor_exercise,4);
        competitor31_event1.setevent(competition.getEvents().get(8));
        Attempt competitor31_event2 = new Attempt(vault,9);
        competitor31_event2.setevent(competition.getEvents().get(9));

        Attempt competitor32_event1 = new Attempt(uneven_bars,7);
        competitor32_event1.setevent(competition.getEvents().get(6));
        Attempt competitor32_event2 = new Attempt(balance_beams,7);
        competitor32_event2.setevent(competition.getEvents().get(7));

        Attempt competitor33_event1 = new Attempt(floor_exercise,8);
        competitor33_event1.setevent(competition.getEvents().get(8));
        Attempt competitor33_event2 = new Attempt(vault,1);
        competitor33_event2.setevent(competition.getEvents().get(9));

        Attempt competitor34_event1 = new Attempt(uneven_bars,8);
        competitor34_event1.setevent(competition.getEvents().get(6));
        Attempt competitor34_event2 = new Attempt(balance_beams,2);
        competitor34_event2.setevent(competition.getEvents().get(7));

        Attempt competitor35_event1 = new Attempt(floor_exercise,7);
        competitor35_event1.setevent(competition.getEvents().get(8));
        Attempt competitor35_event2 = new Attempt(vault,9);
        competitor35_event2.setevent(competition.getEvents().get(9));
       
       
        //Male competitors
        Competitor competitor1 = new Competitor(1,"Johnny Depp", "Male");
        competitor1.setEvents(competition.getEvents().get(0));
        competitor1.setEvents(competition.getEvents().get(1));
        competitor1.setAttempt(competitor1_event1);
        competitor1.setAttempt(competitor1_event2);
        competitorList.add(competitor1);

        Competitor competitor2 = new Competitor(2,"Arnold Schwarzenegger", "Male");
        competitor2.setEvents(competition.getEvents().get(2));
        competitor2.setEvents(competition.getEvents().get(3));
        competitor2.setAttempt(competitor2_event1);
        competitor2.setAttempt(competitor2_event2);
        competitorList.add(competitor2);

        Competitor competitor3 = new Competitor(3,"Jim Carrey", "Male");
        competitor3.setEvents(competition.getEvents().get(4));
        competitor3.setEvents(competition.getEvents().get(5));
        competitor3.setAttempt(competitor3_event1);
        competitor3.setAttempt(competitor3_event2);
        competitorList.add(competitor3);

        Competitor competitor4 = new Competitor(4,"Daniel Radcliffe", "Male");
        competitor4.setEvents(competition.getEvents().get(0));
        competitor4.setEvents(competition.getEvents().get(1));
        competitor4.setAttempt(competitor4_event1);
        competitor4.setAttempt(competitor4_event2);
        competitorList.add(competitor4);

        Competitor competitor5 = new Competitor(5,"Leonardo DiCaprio", "Male");
        competitor5.setEvents(competition.getEvents().get(2));
        competitor5.setEvents(competition.getEvents().get(3));
        competitor5.setAttempt(competitor5_event1);
        competitor5.setAttempt(competitor5_event2);
        competitorList.add(competitor5);

        Competitor competitor6 = new Competitor(6,"Tom Cruise", "Male");
        competitor6.setEvents(competition.getEvents().get(4));
        competitor6.setEvents(competition.getEvents().get(5));
        competitor6.setAttempt(competitor6_event1);
        competitor6.setAttempt(competitor6_event2);
        competitorList.add(competitor6);

        Competitor competitor7 = new Competitor(7,"Brad Pitt", "Male");
        competitor7.setEvents(competition.getEvents().get(0));
        competitor7.setEvents(competition.getEvents().get(1));
        competitor7.setAttempt(competitor7_event1);
        competitor7.setAttempt(competitor7_event2);
        competitorList.add(competitor7);

        Competitor competitor8 = new Competitor(8,"Charles Chaplin", "Male");
        competitor8.setEvents(competition.getEvents().get(2));
        competitor8.setEvents(competition.getEvents().get(3));
        competitor8.setAttempt(competitor8_event1);
        competitor8.setAttempt(competitor8_event2);
        competitorList.add(competitor8);

        Competitor competitor9 = new Competitor(9,"Morgan Freeman", "Male");
        competitor9.setEvents(competition.getEvents().get(4));
        competitor9.setEvents(competition.getEvents().get(5));
        competitor9.setAttempt(competitor9_event1);
        competitor9.setAttempt(competitor9_event2);
        competitorList.add(competitor9);

        Competitor competitor10 = new Competitor(10,"Hugh Jackman", "Male");
        competitor10.setEvents(competition.getEvents().get(0));
        competitor10.setEvents(competition.getEvents().get(1));
        competitor10.setAttempt(competitor10_event1);
        competitor10.setAttempt(competitor10_event2);
        competitorList.add(competitor10);

        Competitor competitor11 = new Competitor(11,"Matt Damon", "Male");
        competitor11.setEvents(competition.getEvents().get(2));
        competitor11.setEvents(competition.getEvents().get(3));
        competitor11.setAttempt(competitor11_event1);
        competitor11.setAttempt(competitor11_event2);
        competitorList.add(competitor11);

        Competitor competitor12 = new Competitor(12,"Will Smith", "Male");
        competitor12.setEvents(competition.getEvents().get(4));
        competitor12.setEvents(competition.getEvents().get(5));
        competitor12.setAttempt(competitor12_event1);
        competitor12.setAttempt(competitor12_event2);
        competitorList.add(competitor12);

        Competitor competitor13 = new Competitor(13,"Clint Eastwood", "Male");
        competitor13.setEvents(competition.getEvents().get(0));
        competitor13.setEvents(competition.getEvents().get(1));
        competitor13.setAttempt(competitor13_event1);
        competitor13.setAttempt(competitor13_event2);
        competitorList.add(competitor13);

        Competitor competitor14 = new Competitor(14,"George Clooney", "Male");
        competitor14.setEvents(competition.getEvents().get(2));
        competitor14.setEvents(competition.getEvents().get(3));
        competitor14.setAttempt(competitor4_event1);
        competitor14.setAttempt(competitor14_event2);
        competitorList.add(competitor14);

        Competitor competitor15 = new Competitor(15,"Harrison Ford", "Male");
        competitor15.setEvents(competition.getEvents().get(4));
        competitor15.setEvents(competition.getEvents().get(5));
        competitor15.setAttempt(competitor15_event1);
        competitor15.setAttempt(competitor15_event2);
        competitorList.add(competitor15);

        Competitor competitor16 = new Competitor(16,"Robert De Niro", "Male");
        competitor16.setEvents(competition.getEvents().get(0));
        competitor16.setEvents(competition.getEvents().get(1));
        competitor16.setAttempt(competitor16_event1);
        competitor16.setAttempt(competitor16_event2);
        competitorList.add(competitor16);

        Competitor competitor17 = new Competitor(17,"Al Pacino", "Male");
        competitor17.setEvents(competition.getEvents().get(2));
        competitor17.setEvents(competition.getEvents().get(3));
        competitor17.setAttempt(competitor17_event1);
        competitor17.setAttempt(competitor17_event2);
        competitorList.add(competitor17);

        Competitor competitor18 = new Competitor(18,"Robert Downey Jr.", "Male");
        competitor18.setEvents(competition.getEvents().get(4));
        competitor18.setEvents(competition.getEvents().get(5));
        competitor18.setAttempt(competitor18_event1);
        competitor18.setAttempt(competitor18_event2);
        competitorList.add(competitor18);

        Competitor competitor19 = new Competitor(19,"Russell Crowe", "Male");
        competitor19.setEvents(competition.getEvents().get(0));
        competitor19.setEvents(competition.getEvents().get(1));
        competitor19.setAttempt(competitor19_event1);
        competitor19.setAttempt(competitor19_event2);
        competitorList.add(competitor19);

        Competitor competitor20 = new Competitor(20,"Liam Neeson", "Male");
        competitor20.setEvents(competition.getEvents().get(2));
        competitor20.setEvents(competition.getEvents().get(3));
        competitor20.setAttempt(competitor20_event1);
        competitor20.setAttempt(competitor20_event2);
        competitorList.add(competitor20);

        
        //Female competitors
        Competitor competitor21 = new Competitor(21,"Emma Watson", "Female");
        competitor21.setEvents(competition.getEvents().get(8));
        competitor21.setEvents(competition.getEvents().get(9));
        competitor21.setAttempt(competitor21_event1);
        competitor21.setAttempt(competitor21_event2);
        competitorList.add(competitor21);

        Competitor competitor22 = new Competitor(22,"Cameron Diaz", "Female");
        competitor22.setEvents(competition.getEvents().get(6));
        competitor22.setEvents(competition.getEvents().get(7));
        competitor22.setAttempt(competitor22_event1);
        competitor22.setAttempt(competitor22_event2);
        competitorList.add(competitor22);

        Competitor competitor23 = new Competitor(23,"Kate Winslet", "Female");
        competitor23.setEvents(competition.getEvents().get(8));
        competitor23.setEvents(competition.getEvents().get(9));
        competitor23.setAttempt(competitor23_event1);
        competitor23.setAttempt(competitor23_event2);
        competitorList.add(competitor23);

        Competitor competitor24 = new Competitor(24,"Natalie Portman", "Female");
        competitor24.setEvents(competition.getEvents().get(6));
        competitor24.setEvents(competition.getEvents().get(7));
        competitor24.setEvents(competition.getEvents().get(9));
        competitor24.setAttempt(competitor24_event1);
        competitor24.setAttempt(competitor24_event2);
        competitor24.setAttempt(competitor24_event3);
        competitorList.add(competitor24);

        Competitor competitor25 = new Competitor(25,"Angelina Jolie", "Female");
        competitor25.setEvents(competition.getEvents().get(8));
        competitor25.setEvents(competition.getEvents().get(9));
        competitor25.setAttempt(competitor25_event1);
        competitor25.setAttempt(competitor25_event2);
        competitorList.add(competitor25);

        Competitor competitor26 = new Competitor(26,"Scarlett Johansson", "Female");
        competitor26.setEvents(competition.getEvents().get(6));
        competitor26.setEvents(competition.getEvents().get(7));
        competitor26.setAttempt(competitor26_event1);
        competitor26.setAttempt(competitor26_event2);
        competitorList.add(competitor26);

        Competitor competitor27 = new Competitor(27,"Anne Hathaway", "Female");
        competitor27.setEvents(competition.getEvents().get(8));
        competitor27.setEvents(competition.getEvents().get(9));
        competitor27.setAttempt(competitor27_event1);
        competitor27.setAttempt(competitor27_event2);
        competitorList.add(competitor27);

        Competitor competitor28 = new Competitor(28,"Jessica Alba", "Female");
        competitor28.setEvents(competition.getEvents().get(6));
        competitor28.setEvents(competition.getEvents().get(7));
        competitor28.setAttempt(competitor28_event1);
        competitor28.setAttempt(competitor28_event2);
        competitorList.add(competitor28);

        Competitor competitor29 = new Competitor(29,"Keira Knightley", "Female");
        competitor29.setEvents(competition.getEvents().get(8));
        competitor29.setEvents(competition.getEvents().get(9));
        competitor29.setAttempt(competitor29_event1);
        competitor29.setAttempt(competitor29_event2);
        competitorList.add(competitor29);

        Competitor competitor30 = new Competitor(30,"Julia Roberts", "Female");
        competitor30.setEvents(competition.getEvents().get(6));
        competitor30.setEvents(competition.getEvents().get(7));
        competitor30.setAttempt(competitor30_event1);
         competitor30.setAttempt(competitor30_event2);
        competitorList.add(competitor30);

        Competitor competitor31 = new Competitor(31,"Halle Berry", "Female");
        competitor31.setEvents(competition.getEvents().get(8));
        competitor31.setEvents(competition.getEvents().get(9));
        competitor31.setAttempt(competitor31_event1);
        competitor31.setAttempt(competitor31_event2);
        competitorList.add(competitor31);

        Competitor competitor32 = new Competitor(32,"Megan Fox", "Female");
        competitor32.setEvents(competition.getEvents().get(6));
        competitor32.setEvents(competition.getEvents().get(7));
        competitor32.setAttempt(competitor32_event1);
        competitor32.setAttempt(competitor32_event2);
        competitorList.add(competitor32);

        Competitor competitor33 = new Competitor(33,"Sandra Bullock", "Female");
        competitor33.setEvents(competition.getEvents().get(8));
        competitor33.setEvents(competition.getEvents().get(9));
        competitor33.setAttempt(competitor33_event1);
        competitor33.setAttempt(competitor33_event2);
        competitorList.add(competitor33);

        Competitor competitor34 = new Competitor(34,"Drew Barrymore", "Female");
        competitor34.setEvents(competition.getEvents().get(6));
        competitor34.setEvents(competition.getEvents().get(7));
        competitor34.setAttempt(competitor34_event1);
        competitor34.setAttempt(competitor34_event2);
        competitorList.add(competitor34);

        Competitor competitor35 = new Competitor(35,"Kate Beckinsale", "Female");
        competitor35.setEvents(competition.getEvents().get(8));
        competitor35.setEvents(competition.getEvents().get(9));
        competitor35.setAttempt(competitor35_event1);
        competitor35.setAttempt(competitor35_event2);
        competitorList.add(competitor35);
         
           
        Scanner in = new Scanner(System.in);
        boolean eventFlag = false;
        boolean competitorFlag = false;
       
        System.out.println("Welcome to Gymnastic Event Management System. Please Choose your action");
        System.out.println("List Event Information....1");
        System.out.println("List Competitor Events....2");
        System.out.println("List Event's attempts.....3");
        System.out.println();
        System.out.print("Enter choice:>");
        String input = in.nextLine();

        switch(input){

        case "1":
            System.out.println();
            System.out.println("Available Events; ");
               System.out.println("1. Pommel Horse");
               System.out.println("2. Still Rings");
               System.out.println("3. Parallel Bars");
               System.out.println("4. High Bar");
               System.out.println("5. Floor Exercise");
               System.out.println("6. Vault");
               System.out.println("7. Uneven Bars");
               System.out.println("8. Balance Beams");

            System.out.print("\nPlease type chosen event:>");
            String eventName = in.nextLine();
            if(eventName.equalsIgnoreCase("vault") || eventName.equalsIgnoreCase("floor exercise"))
            {
                System.out.print("Please type Male or Female event:>");
                String gender = in.nextLine();

                    for(Event event: eventList)
                    {
                       if(event.getName().equalsIgnoreCase(eventName) && event.getEventType().equalsIgnoreCase(gender))
                       {
                           System.out.println("\n");
                           System.out.println("------------------------------------");
                           System.out.println("\n"+event.toString());
                           break;
                       } 
                    }
                    System.out.println("Committee Members:");
                    for(CommitteeMember comMem: cmList)
                    {
                        for(Event eventOrganized : comMem.geteventsOrganized())
                        {
                            if(eventName.equalsIgnoreCase(eventOrganized.getName()) && gender.equalsIgnoreCase(eventOrganized.getEventType()))
                            {
                                System.out.println(comMem.getName());
                            }
                        }
                    }
                    System.out.println("\nCompetitors:");
                    for(Competitor competitor: competitorList)
                    {
                        for(Event eventEntered: competitor.getEvents())
                        {
                            if(eventName.equalsIgnoreCase(eventEntered.getName()) && gender.equalsIgnoreCase(competitor.getGender()))
                            {
                                System.out.println(competitor.toString());
                                System.out.println("\n");
                            }
                        }
                    }
                   System.out.println("------------------------------------"); 

            }
            else
            {
                 for(Event event: eventList)
                    {
                       if(event.getName().equalsIgnoreCase(eventName))
                       {
                           eventFlag =true;
                           System.out.println("------------------------------------");
                           System.out.println("\n"+event.toString());
                           break;
                       } 
                    }
                 if( eventFlag !=true)
                 {
                    System.out.println("Event doesn't exist\nExiting program");
                    break;
                 }
                    System.out.println("Committee Members:");
                    for(CommitteeMember comMem: cmList)
                    {
                        for(Event eventOrganized : comMem.geteventsOrganized())
                        {
                            if(eventName.equalsIgnoreCase(eventOrganized.getName()))
                            {
                                System.out.println(comMem.getName());
                            }
                        }
                    }
                    System.out.println("\nCompetitors:");
                    for(Competitor competitor: competitorList)
                    {
                        for(Event eventEntered: competitor.getEvents())
                        {
                            if(eventName.equalsIgnoreCase(eventEntered.getName()))
                            {
                                System.out.println(competitor.toString());
                                System.out.println("\n");
                            }
                        }
                    }

            }
            break;

        case "2":
            int count =0;
             for(Competitor competitor: competitorList)
                    {                        
                      System.out.println((count+1)+". "+competitor.getName());
                      count++;                
                    }
             System.out.print("\n");
             System.out.print("Please enter name of the competitor:>");
             String competitor = in.nextLine();
             for(Competitor com: competitorList)
             {
                 if(com.getName().equalsIgnoreCase(competitor))
                 {
                     competitorFlag = true;
                       System.out.println("------------------------------------");
                    for(Attempt at: com.getAttempts())
                    {

                        System.out.println("Event entered: "+at.getEvent().getName());
                         System.out.println("Routine: "+at.getRoutine().getDescription()+"\nDifficulity: "+at.getRoutine().getDifficulityRating());
                          System.out.println("Score "+at.getScore()+"\n");                     
                    } 
                     System.out.println("------------------------------------");
                    break;
                 }

             }
             if(competitorFlag == false)
             {
               System.out.println("Competitor doesn't exist\nExiting program");  
             }

            break;

        case "3":
            System.out.println("EVENTS AVAILABLE");
               System.out.println("1. Pommel Horse");
               System.out.println("2. Still Rings");
               System.out.println("3. Parallel Bars");
               System.out.println("4. High Bar");
               System.out.println("5. Floor Exercise");
               System.out.println("6. Vault");
               System.out.println("7. Uneven Bars");
               System.out.println("8. Balance Beams");
               System.out.print("\nPlease choose event:>");
               eventName = in.nextLine();
                  if(eventName.equalsIgnoreCase("vault") || eventName.equalsIgnoreCase("floor exercise"))
            {
                System.out.println("Please choose Male or Female event: Male/Female");
                String gender = in.nextLine();

                    for(Event event: eventList)
                    {
                       if(event.getName().equalsIgnoreCase(eventName) && event.getEventType().equalsIgnoreCase(gender))
                       {
                           System.out.println("------------------------------------");
                           System.out.println("\n"+event.toString());
                           break;
                       } 
                    }
                    System.out.println("\nCompetitors:");
                    for(Competitor competitors: competitorList)
                    {
                        for(Attempt attempt: competitors.getAttempts())
                        {
                            if(eventName.equalsIgnoreCase(attempt.getEvent().getName()) && gender.equalsIgnoreCase(competitors.getGender()))
                            {
                                System.out.println(competitors.toString());
                               System.out.println("Routine: "+attempt.getRoutine().getDescription()+"\nDifficulity: "+attempt.getRoutine().getDifficulityRating());
                               System.out.println("Score "+attempt.getScore()+"\n"); 
                            }
                        }
                    }
                   System.out.println("------------------------------------"); 

            }

            else
            {
                 for(Event event: eventList)
                    {
                       if(event.getName().equalsIgnoreCase(eventName))
                       {
                           eventFlag = true;
                           System.out.println("------------------------------------");
                           System.out.println("\n"+event.toString());
                           break;
                       } 
                    }
                 if( eventFlag !=true)
                 {
                    System.out.println("Event doesn't exist\nExiting program");
                    break;
                 }

                    System.out.println("\nCompetitors:");
                     for(Competitor competitors: competitorList)
                    {
                        for(Attempt attempt: competitors.getAttempts())
                        {
                            if(eventName.equalsIgnoreCase(attempt.getEvent().getName()))
                            {
                                System.out.println(competitors.toString());
                               System.out.println("Routine: "+attempt.getRoutine().getDescription()+"\nDifficulity: "+attempt.getRoutine().getDifficulityRating());
                               System.out.println("Score "+attempt.getScore()+"\n"); 
                            }
                        }
                    }

            }
            break;

            default:
                 System.out.println("Wrong option selected. Choose wisely"); 
            break;
        }

     }

 }