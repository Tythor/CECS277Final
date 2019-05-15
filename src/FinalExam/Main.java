package FinalExam;

import FinalExam.Factory.*;

public class Main {
<<<<<<< HEAD
    
	public static void main(String[] args) {

        /*SmallPartyRoom a = new SmallPartyRoom();
=======
    public static void main(String[] args) {
        SmallPartyRoom a = new SmallPartyRoom();
>>>>>>> master
        System.out.println(a);
        System.out.println();

        MediumPartyRoom b = new MediumPartyRoom();
        System.out.println(b);
        System.out.println();

        AquaworldRoom c = new AquaworldRoom();
        String d = c.newAquaworldRoom();
        System.out.println(d);
        System.out.println();

        BillardsLounge e = new BillardsLounge();
        System.out.println(e);
        System.out.println();

        KaraokeLounge f = new KaraokeLounge();
        System.out.println(f);
<<<<<<< HEAD
        System.out.println();
         
        System.out.println(); */
    	
		
		// Attempting Decorator Pattern
		
		// Room # 1
    	    
        Room xyz = new SmallPartyRoom();
        
        xyz = new Projector(xyz, 3); // To modify
                
        xyz = new PartyFavorsBag(xyz, 5);
        
        xyz = new PartyDecorations(xyz, "Space");
        
        System.out.println(xyz.getDescription());
         
        System.out.println();
        
        // Room # 2
         
       Room abc = new AquaworldRoom();
       
       abc = new Projector(abc, 5);
       
       abc = new PartyFavorsBag(abc, 25);
       
       abc = new PartyDecorations(abc, "Hawaiian");
       
       abc = new Towel(abc, 4);
         
       System.out.println(abc.getDescription());  
       
       System.out.println();
       
       // Room # 3
       
       Room lmn = new BillardsLounge();
       
       lmn = new Projector(lmn, 6);
                     
       lmn = new PartyFavorsBag(lmn, 10);
       
       lmn = new PartyDecorations(lmn, "Jungle");
                          
       System.out.println(lmn.getDescription());
       
       System.out.println();
       Date test_date = new Date();
       test_date.setDay(22);
       test_date.setMonth(3);
       test_date.setYear(2018);
       Room test_room = new AquaworldRoom();
       MakeReservation r = new MakeReservation(test_date,test_room);
       
       //for (MakeReservation obj: r) {
    	   
      //}
       
       System.out.println(test_date);
       System.out.println(test_room);
       
       waitListTemp  w = new waitListTemp();
       w.setNewGuest(r);
       for(MakeReservation obj: w.getGuests()) {
    	   System.out.println(obj.getDate());
       }
         
       
       
       // First Try
         
         /* Room abc = new AquaworldRoom();
       
       	abc = new Projector(abc);      
       	 
       	((Projector) abc).setHour(5); // Type Cast
       	
       	System.out.println("The Aqua Room has the projector for " +  ((Projector)abc).getHour() + " hours");
       	
       	abc = new PartyDecorations(abc);
       	
       	((PartyDecorations)abc).setTheme("Hawaiian"); // Type Cast
       	
        System.out.println("The theme for the abc room is: " + ((PartyDecorations)abc).getTheme());

       	abc =  new PartyFavorsBag(abc);
       	
       	((PartyFavorsBag)abc).setNumPartyFavorsBag(25); // Type Cast
       	
        System.out.println(abc.getDescription());
        
        System.out.println("The Number of Party Bags for abc room is " + ((PartyFavorsBag)abc).getNumPartyFavorsBag());

        System.out.println();
       
       
        // Room # 3
        
        Room lmn = new BillardsLounge();
       
       lmn = new Projector(lmn);
       
       ((Projector)lmn).setHour(6); // Type Cast
       
       	System.out.println("The Billards Lounge has the projector for " +  ((Projector)lmn).getHour() + " hours");
       
       lmn = new PartyDecorations(lmn);
       
       ((PartyDecorations)lmn).setTheme("Jungle");
       
       System.out.println("The theme for the lmn room is: " + ((PartyDecorations)lmn).getTheme());
       
       lmn = new PartyFavorsBag(lmn);
       
       ((PartyFavorsBag)lmn).setNumPartyFavorsBag(10); // Type Cast
       
       System.out.println("The Number of Party Bags for lmn room is: " + ((PartyFavorsBag)lmn).getNumPartyFavorsBag());
       
       System.out.println(lmn.getDescription());
       
       System.out.println(); */
        
=======

        // Abstract Factory Implementation
        RoomFactory roomFactory = null;
        String name = "MediumPartyRoom";
        switch (name) {
            case "SmallPartyRoom":
                roomFactory = new SmallPartyRoomFactory();
                break;
            case "MediumPartyRoom":
                roomFactory = new MediumPartyRoomFactory();
                break;
            case "AquaworldRoom":
                roomFactory = new AquaworldRoomFactory();
                break;
            case "BilliardsLounge":
                roomFactory = new BilliardsLoungeFactory();
                break;
            case "KaraokeLounge":
                roomFactory = new KaraokeLoungeFactory();
                break;
        }
        Room room = roomFactory.createRoom();
        System.out.println(room);

        Room smallPartyRoom = new SmallPartyRoomFactory().createRoom();
        System.out.println(smallPartyRoom);
>>>>>>> master
    }
}
