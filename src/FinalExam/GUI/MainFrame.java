package FinalExam.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonListener;

import FinalExam.AquaworldRoom;
import FinalExam.MediumPartyRoom;
import FinalExam.SmallPartyRoom;
import FinalExam.KaraokeLounge;
import FinalExam.BillardsLounge;
import FinalExam.BasicMealPlan;
import FinalExam.BronzeMealPlan;
import FinalExam.SilverMealPlan;
import FinalExam.GoldMealPlan;
import FinalExam.PlatinumMealPlan;

public class MainFrame extends JFrame {
	JLabel panelTitle;
	JMenuBar menuBar;
	JScrollPane scrollPane;
	JButton bookButton;
	JPanel centerPanel;
	JPanel panel;
	JPanel aq;
	JPanel spr;
	JPanel mpr;
	JPanel kl;
	JPanel bl;
	JPanel bmp;
	JPanel brmp;
	JPanel smp;
	JPanel gmp;
	JPanel pmp;

	ArrayList<JPanel> partyRooms = new ArrayList<>();
	ArrayList<JPanel> lounges = new ArrayList<>();
	ArrayList<JPanel> mealPlans = new ArrayList<>();

	SmallPartyRoom small = new SmallPartyRoom();
	MediumPartyRoom medium = new MediumPartyRoom();
	AquaworldRoom aquaworld = new AquaworldRoom();
	KaraokeLounge karaoke = new KaraokeLounge();
	BillardsLounge billiards = new BillardsLounge();
	BasicMealPlan basic = new BasicMealPlan();
	BronzeMealPlan bronze = new BronzeMealPlan();
	SilverMealPlan silver = new SilverMealPlan();
	GoldMealPlan gold = new GoldMealPlan();
	PlatinumMealPlan platinum = new PlatinumMealPlan();
	

	//border settings used in the method addARoomDescription()
 	Border raisedbevel = BorderFactory.createRaisedBevelBorder(); 
 	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	
	MainFrame(){
		this.setTitle("Reservation System");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.createMenuBar();
		this.createDefaultPanel();
		this.setVisible(true);

		partyRooms.add(spr);
		partyRooms.add(mpr);
		partyRooms.add(aq);

		lounges.add(kl);
		lounges.add(bl);

		mealPlans.add(bmp);
		mealPlans.add(brmp);
		mealPlans.add(smp);
		mealPlans.add(gmp);
		mealPlans.add(pmp);
	}
	
	/*
	 * initializes the default center panel and adds it to this frame
	 * */
	private void createDefaultPanel() {
		centerPanel = new JPanel();
		aq = new JPanel();
		spr = new JPanel();
		mpr = new JPanel();
		kl = new JPanel();
		bl = new JPanel();
		bmp= new JPanel();
		brmp = new JPanel();
		smp = new JPanel() ;
		gmp = new JPanel();
		pmp = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		//Title of default view
		panelTitle = new JLabel("Party World Rooms");
		panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		centerPanel.add(panelTitle);
		
		
//		ActionListener book = new bookButtonListener(); 
//		bookButton.addActionListener(book);
		
	//	bookButton.addActionListener(new bookButtonListener());
		
		addARoomDescription(centerPanel, "file:///Users/audreybrio/Documents/GitHub/CECS277Final/src/FinalExam/GUI/aquaWorld.jpg", "Small Party Room" , small.toString());
		addARoomDescription(centerPanel, "aquaWorld.jpg", "Small Party Room" , small.toString());
		//centerPanel.add(spr);
//		bookButton.addActionListener(new bookButtonListener());
//		mpr = addARoomDescription("","Medium Party Room", medium.toString());
//		centerPanel.add(mpr);
//		bookButton.addActionListener(new bookButtonListener());
//		aq = addARoomDescription("aquaWorld.jpg", "Aquaworld Room" , aquaworld.newAquaworldRoom());
//		centerPanel.add(aq);
//		bookButton.addActionListener(new bookButtonListener());
//		kl = addARoomDescription( "C:\\Users\\audreybrio\\Desktop\\Pictures\\smallroom.jpg","Karaoke Lounge", karaoke.toString());
//		centerPanel.add(kl);
//		kl.setVisible(false);
//		bookButton.addActionListener(new bookButtonListener());
//		bl = addARoomDescription( "C:\\Users\\\\Desktop\\Pictures\\medroom.jpg", "Billiards Lounge" , billiards.toString());
//		centerPanel.add(bl);
//		bl.setVisible(false);
//		bookButton.addActionListener(new bookButtonListener());
//		bmp = addMealPlanDescription("Basic Meal Plan", basic.toString(), basic.getCost());
//		centerPanel.add(bmp);
//		bmp.setVisible(false);
//		brmp = addMealPlanDescription("Bronze Meal Plan", bronze.toString(), bronze.getCost());
//		centerPanel.add(brmp);
//		brmp.setVisible(false);
//		smp = addMealPlanDescription("Silver Meal Plan", silver.toString(), silver.getCost());
//		centerPanel.add(smp);
//		smp.setVisible(false);
//		gmp = addMealPlanDescription("Gold Meal Plan", gold.toString(), gold.getCost());
//		centerPanel.add(gmp);
//		gmp.setVisible(false);
//		pmp = addMealPlanDescription("Platinum Meal Plan", platinum.toString(), platinum.getCost());
//		centerPanel.add(pmp);
		pmp.setVisible(false);
		
		
		//ActionListener book = new bookButtonListener(); 
		//bookButton.addActionListener(book);

		
		scrollPane = new JScrollPane(centerPanel);
		this.add(scrollPane, BorderLayout.CENTER);
	}
	
	/* initializes menu bar items and adds them to this window*/
	private void createMenuBar() {
		menuBar = new JMenuBar();
		//-------
				JMenu menu;
				JMenu submenu;
				JMenuItem menuItem;
				
				//-------  DESCRIPTIONS MENU------------------
				menu = new JMenu("Descriptions");

				//Party Room Sub Menu
				submenu = new JMenu("Party Rooms");

				
				menuItem = new JMenuItem("All");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);

				menuItem = new JMenuItem("Small Party Rooms");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Medium Party Rooms");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Aquaworld Room");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				menu.add(submenu);
				
				//Lounges Sub Menu
				submenu = new JMenu("Lounges");
				
				menuItem = new JMenuItem("All");
				menuItem.addActionListener(new LoungeItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Karaoke Lounges");
				menuItem.addActionListener(new LoungeItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Billiards Lounges");
				menuItem.addActionListener(new LoungeItemListener());
				submenu.add(menuItem);
				
				menu.add(submenu);
				menu.addSeparator();
				
			
				
				//Meal Plans Sub Menu
				submenu = new JMenu("Meal Plans");

				menuItem = new JMenuItem("All");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Basic");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Bronze");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Silver");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Gold");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Platinum");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menu.add(submenu);
			
			
				
				menuBar.add(menu);
				
				
				//-------  RESERVATIONS MENU------------------
				menu = new JMenu("Reservations");
						
						//New reservation item
						menuItem = new JMenuItem("New Reservation...");
						menu.add(menuItem);
						menu.addSeparator();
						
						//Edit reservation item
						menuItem = new JMenuItem("Edit Existing Reservation...");
						menu.add(menuItem);
						menu.addSeparator();
						
						
						//Manage reservation sub menu 
						submenu = new JMenu("Manage Current Reservation");
						submenu.setMnemonic(KeyEvent.VK_S);

						menuItem = new JMenuItem("Check-in");
						submenu.add(menuItem);
						
						menuItem = new JMenuItem("Check-out");
						submenu.add(menuItem);
						

						menu.add(submenu);
				
				
				menuBar.add(menu);
				this.add(menuBar, BorderLayout.NORTH);
	
	}
	
	
	
	/* 
	 * adds room image and description to a given container
	 * @param container - the container onto which to add the new description
	 * @param imgDir - the directory of the image
	 * @param roomName - the name of the room
	 * @param roomDesc - the description of the room
	 * 
	 * */
	
	 private void addARoomDescription(Container c, String imgDir, String roomName, String roomDesc) {
		 	JPanel p = new JPanel();
		 	
		 	ImageIcon icon = new ImageIcon(imgDir);
		 	JLabel picture = new JLabel(icon);
		 	picture.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		 	
		 	//Set the position of the text, relative to the icon:
		 	picture.setVerticalTextPosition(JLabel.TOP);
		 	picture.setHorizontalTextPosition(JLabel.CENTER);
		 	//Set border around 
		 	picture.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
		 	picture.setVisible(true);
		 	p.add(picture);
		 	
	
		 	JTextArea description = new JTextArea(5,10);
		 	description.append(roomDesc);
		 	description.setEditable(false);
		 	description.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		 	description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
			p.add(description);
			
	        bookButton = new JButton("Book Now");
	        p.add(bookButton);
	        c.add(p);
	    }
//	 private JPanel addARoomDescription(String imgDir, String roomName, String roomDesc) {
//		 	JPanel p = new JPanel();
//		 	
//		 	ImageIcon icon = new ImageIcon(imgDir);
//		 	JLabel picture = new JLabel(roomName, icon, JLabel.CENTER);
//		 	picture.setFont(new Font(Font.SERIF, Font.BOLD, 20));
//		 	
//		 	//Set the position of the text, relative to the icon:
//		 	picture.setVerticalTextPosition(JLabel.TOP);
//		 	picture.setHorizontalTextPosition(JLabel.CENTER);
//		 	//Set border around 
//		 	picture.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
//		 	picture.setVisible(true);
//		 	p.add(picture);
//		 	
//	
//		 	JTextArea description = new JTextArea(5,10);
//		 	description.append(roomDesc);
//		 	description.setEditable(false);
//		 	description.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
//		 	description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
//			p.add(description);
//			
//	        bookButton = new JButton("Book Now");
//	        p.add(bookButton);
//	        return p;
//	    }
	 
	 private JPanel addMealPlanDescription(String mealPlan, String mealPlanDesc, int mealPlanCost) {
		 	JPanel p = new JPanel();
		 	String costmp = String.format("\nCost: $%S", mealPlanCost);
		 	JLabel text = new JLabel(mealPlan, JLabel.CENTER);
		 	text.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		 	
		 	//Set the position of the text, relative to the icon:
		 	text.setVerticalTextPosition(JLabel.TOP);
		 	text.setHorizontalTextPosition(JLabel.CENTER);
		 	//Set border around 
		 	text.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
		 	text.setVisible(true);
		 	p.add(text);
		 	
	
		 	JTextArea description = new JTextArea(5,10);
		 	description.append(mealPlanDesc);
		 	description.append(costmp);
		 	description.setEditable(false);
		 	description.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		 	description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
			p.add(description);
		
	        return p;
	    }


	
	class MealItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			panelTitle.setText("Party World Meal Plans");
			centerPanel.repaint();

			for (JPanel jPanel : partyRooms)
				jPanel.setVisible(false);
			for (JPanel jPanel: lounges)
				jPanel.setVisible(false);

			JMenuItem menuItem = (JMenuItem) click.getSource();
			String item = menuItem.getText();
			if(item.equals("All")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(true);
			}
			else if(item.equals("Basic")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(false);
				bmp.setVisible(true);
			}
			else if(item.equals("Bronze")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(false);
				brmp.setVisible(true);
			}
			else if(item.equals("Silver")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(false);
				smp.setVisible(true);
			}
			else if(item.equals("Gold")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(false);
				gmp.setVisible(true);
			}
			else if(item.equals("Platinum")) {
				for (JPanel jPanel: mealPlans)
					jPanel.setVisible(false);
				pmp.setVisible(true);
			}
			
			
		}
		
	}
	
	class LoungeItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent select) {
			panelTitle.setText("Lounge Rooms");
			centerPanel.repaint();

			for (JPanel jPanel : partyRooms)
				jPanel.setVisible(false);
			for (JPanel jPanel: mealPlans)
				jPanel.setVisible(false);

			JMenuItem item = (JMenuItem) select.getSource();
			centerPanel.repaint();
			if(item.getText().equals("All")) {
				kl.setVisible(true);
				bl.setVisible(true);
				centerPanel.repaint();
			}
			if(item.getText().equals("Karaoke Lounges")) {
				kl.setVisible(true);
				bl.setVisible(false);
				centerPanel.repaint();
			}
			else if(item.getText().equals("Billiards Lounges")) {
				kl.setVisible(false);
				bl.setVisible(true);
				centerPanel.repaint();
			}	
			
		}
		
	}
	


	class RoomItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent select) {
			panelTitle.setText("Party World Rooms");
			centerPanel.repaint();
			for (JPanel jPanel : lounges)
				jPanel.setVisible(false);
			for (JPanel jPanel: mealPlans)
				jPanel.setVisible(false);

			JMenuItem item = (JMenuItem) select.getSource();
			if(item.getText().equals("All")) {
				for (JPanel jPanel : partyRooms)
					jPanel.setVisible(true);
				centerPanel.repaint();
			}
			if(item.getText().equals("Small Party Rooms")) {
				for (JPanel jPanel : partyRooms)
					jPanel.setVisible(false);
				spr.setVisible(true);
				centerPanel.repaint();
			}
			else if(item.getText().equals("Medium Party Rooms")) {
				for (JPanel jPanel : partyRooms)
					jPanel.setVisible(false);
				mpr.setVisible(true);
				centerPanel.repaint();
			}
			else if(item.getText().equals("Aquaworld Room")) {
				for (JPanel jPanel : partyRooms)
					jPanel.setVisible(false);
				aq.setVisible(true);
				centerPanel.repaint();
			}
		}
	}
	class bookButtonListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent click) {
				SetDateAndTimeFrame setDateandTime = new SetDateAndTimeFrame(); //creates new pastry frame
				setDateandTime.setVisible(true);
				setDateandTime.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			}
		}
	public static void main(String[] args
			) {
		MainFrame f = new MainFrame();
	}
}
