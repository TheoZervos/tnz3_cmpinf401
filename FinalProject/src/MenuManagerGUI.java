import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Class MenuManagerGUI
 * @author theoz
 * Created 11/28/2022
 */
public class MenuManagerGUI {

	/**
	 * This is the main method which makes use of the MenuManagerGUI class
	 * 
	 * @param args Unused
	 */
	public static void main(String[] args) {

		MenuManagerGUI app = new MenuManagerGUI("data\\\\dishes.txt");
	}

	
	/**
	 * This Method creates the entire GUI for the application using a given file in
	 * the correct format
	 * 
	 * @param fileName This is a String for the file directory of which to build the
	 * @since 11-29-2022
	 */
	public MenuManagerGUI(String fileName) {

		MenuManager menu = new MenuManager(fileName);
		
		////creating the main frame
		JFrame frmMain = new JFrame("Menu Manager");
		frmMain.setBounds(1920/7, 1080/7, 1920/2, 1080/2);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		///Creating all components for pnlBuild
		//Creating pnlBuild
		JPanel pnlBuild = new JPanel();
		pnlBuild.setBounds(10, 10, frmMain.getWidth()/2, frmMain.getHeight()/2 - 20);
		pnlBuild.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlBuild.setLayout(null);
		frmMain.getContentPane().add(pnlBuild);
		
		//creating the title label (lblBuild)
		JLabel lblBuild = new JLabel("Build Your Own Menu");
		lblBuild.setFont(new Font("Verdanna", Font.BOLD, 20));
		lblBuild.setBounds(pnlBuild.getWidth()/4 + 20, 7, 300, 30);
		pnlBuild.add(lblBuild);
		
		//creating the entree label
		JLabel lblEntree = new JLabel("Entree:");
		lblEntree.setFont(new Font("Verdanna", Font.BOLD, 15));
		lblEntree.setBounds(30, 50, 100, 20);
		pnlBuild.add(lblEntree);
		
		//creating the entrees dropdown menu
		JComboBox<Entree> cboEntrees = new JComboBox<Entree>();
		cboEntrees.setFont(new Font("Verdanna", Font.BOLD, 15));
		cboEntrees.setBounds(120, 47, 335, 25);
		for(int i = 0; i < menu.getEntrees().size(); i++) {
			cboEntrees.addItem(menu.getEntrees().get(i));
		}
		pnlBuild.add(cboEntrees);
		
		//creating side label
		JLabel lblSide = new JLabel("Side:");
		lblSide.setFont(new Font("Verdanna", Font.BOLD, 15));
		lblSide.setBounds(30, 90, 50, 20);
		pnlBuild.add(lblSide);
		
		//creating the sides dropdown menu
		JComboBox<Side> cboSides = new JComboBox<Side>();
		cboSides.setFont(new Font("Verdanna", Font.BOLD, 15));
		cboSides.setBounds(120, 87, 335, 25);
		for(int i = 0; i < menu.getSides().size(); i++) {
			cboSides.addItem(menu.getSides().get(i));
		}
		pnlBuild.add(cboSides);
		
		//creating the salad lable
		JLabel lblSalad = new JLabel("Salad:");
		lblSalad.setFont(new Font("Verdanna", Font.BOLD, 15));
		lblSalad.setBounds(30, 130, 50, 20);
		pnlBuild.add(lblSalad);
		
		//creating the salads dropdown menu
		JComboBox<Salad> cboSalads = new JComboBox<Salad>();
		cboSalads.setFont(new Font("Verdanna", Font.BOLD, 15));
		cboSalads.setBounds(120, 127, 335, 25);
		for(int i = 0; i < menu.getSalads().size(); i++) {
			cboSalads.addItem(menu.getSalads().get(i));
		}
		pnlBuild.add(cboSalads);
		
		//creating the dessert label
		JLabel lblDessert = new JLabel("Dessert:");
		lblDessert.setFont(new Font("Verdanna", Font.BOLD, 15));
		lblDessert.setBounds(30, 170, 80, 20);
		pnlBuild.add(lblDessert);
		
		//creating the desserts dropdown menu
		JComboBox<Dessert> cboDesserts = new JComboBox<Dessert>();
		cboDesserts.setFont(new Font("Verdanna", Font.BOLD, 15));
		cboDesserts.setBounds(120, 167, 335, 25);
		for(int i = 0; i < menu.getDesserts().size(); i++) {
			cboDesserts.addItem(menu.getDesserts().get(i));
		}
		pnlBuild.add(cboDesserts);
		
		//creating the create menu button
		JButton btnCustom = new JButton("Create Menu With These Dishes");
		btnCustom.setBounds(pnlBuild.getWidth()/30, pnlBuild.getHeight() - pnlBuild.getHeight()/5, pnlBuild.getWidth() - pnlBuild.getWidth()/15, 40);
		btnCustom.setFont(new Font("Verdanna", Font.BOLD, 18));
		pnlBuild.add(btnCustom);
		
		
		
		
		////Creating all components for pnlGenerate
		//creating pnlGenerate
		JPanel pnlGenerate = new JPanel();
		pnlGenerate.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlGenerate.setBounds(10, frmMain.getHeight()/2, frmMain.getWidth()/2, frmMain.getHeight()/2 - 45);
		pnlGenerate.setLayout(null);
		frmMain.getContentPane().add(pnlGenerate);
		
		//Creating the title label (lblGenerate)
		JLabel lblGenerate = new JLabel("Generate A Menu");
		lblGenerate.setFont(new Font("Verdanna", Font.BOLD, 20));
		lblGenerate.setBounds(pnlGenerate.getWidth()/4 + 35, 7, 300, 30);
		pnlGenerate.add(lblGenerate);
		
		//Creating generate random button
		JButton btnRandomMenu = new JButton("Generate a Random Menu");
		btnRandomMenu.setFont(new Font("Verdanna", Font.BOLD, 20));
		btnRandomMenu.setBounds(pnlGenerate.getWidth()/5 - 55, 55, 400, 45);
		pnlGenerate.add(btnRandomMenu);
		
		
		//Creating generate minimum button
		JButton btnMinMenu = new JButton("Generate a Minimum Calories Menu");
		btnMinMenu.setFont(new Font("Verdanna", Font.BOLD, 20));
		btnMinMenu.setBounds(pnlGenerate.getWidth()/5 - 55, 110, 400, 45);
		pnlGenerate.add(btnMinMenu);
	
		
		//Creating generate max button
		JButton btnMaxMenu = new JButton("Generate a Maximum Calories Menu");
		btnMaxMenu.setFont(new Font("Verdanna", Font.BOLD, 20));
		btnMaxMenu.setBounds(pnlGenerate.getWidth()/5 - 55, 165, 400, 45);
		pnlGenerate.add(btnMaxMenu);
		
		
		
		////Creating all components for pnlCreated
		//creating pnlCreated
		JPanel pnlCreated = new JPanel();
		pnlCreated.setBounds(frmMain.getWidth()/2  + 25, 60, frmMain.getWidth()/2 - 55, frmMain.getHeight() - frmMain.getHeight()/6 - 15);
		pnlCreated.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlCreated.setLayout(null);
		frmMain.getContentPane().add(pnlCreated);
		
		//Creating title label(lblCreatedMenus)
		//This is TECHNICALLY not a COMPONENT of the panel pnlCreated
		JLabel lblCreatedMenus = new JLabel("Created Menus:");
		lblCreatedMenus.setFont(new Font("Verdanna", Font.BOLD, 30));
		lblCreatedMenus.setBounds(605, 15, 700, 30);
		frmMain.add(lblCreatedMenus);
		
		//creating created menus list menu
		DefaultListModel<Menu> l = new DefaultListModel<>();
		JList<Menu> listCreatedMenus = new JList<>(l);
		listCreatedMenus.setFont(new Font("Verdanna", Font.BOLD, 18));
		listCreatedMenus.setBorder(BorderFactory.createLineBorder(Color.black));
		listCreatedMenus.setBounds(10, 10, pnlCreated.getWidth()-20, pnlCreated.getHeight() - 80);
		pnlCreated.add(listCreatedMenus);
		
		
		//creating details button
		JButton btnDetails = new JButton("Details");
		btnDetails.setFont(new Font("Verdanna", Font.BOLD, 17));
		btnDetails.setBounds(10, pnlCreated.getHeight() - 60, 130, 50);
		pnlCreated.add(btnDetails);
		
		
		//creating delete all button
		JButton btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.setFont(new Font("Verdanna", Font.BOLD, 17));
		btnDeleteAll.setBounds(148, pnlCreated.getHeight() - 60, 130, 50);
		pnlCreated.add(btnDeleteAll);
		
		
		//creating save button
		JButton btnSave = new JButton("Save to File");
		btnSave.setFont(new Font("Verdanna", Font.BOLD, 17));
		btnSave.setBounds(286, pnlCreated.getHeight() - 60, 130, 50);
		pnlCreated.add(btnSave);



		////ALL EVENT ACTION LISTENERS
		//event action listener for the create menu button
		btnCustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Create Menu With These Dishes button pressed!\n");
				String name = JOptionPane.showInputDialog("Enter a name for your brand new menu!");
				if(name.length() <= 0) {
					while(name.length() <= 0) {
						JOptionPane.showMessageDialog(null, "ERROR: You must enter a name for your menu");
						name = JOptionPane.showInputDialog("Enter a name for your brand new menu");
					}
				}
				Entree ent = (Entree) cboEntrees.getSelectedItem();
				Side sid = (Side) cboSides.getSelectedItem();
				Salad sal = (Salad) cboSalads.getSelectedItem();
				Dessert des = (Dessert) cboDesserts.getSelectedItem();
				Menu m = new Menu(name, ent, sid, sal, des);
				l.addElement(m);
			}
		});


		//event action listener for random button
		btnRandomMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Generate a Random Menu button pressed!\n");
				String name = JOptionPane.showInputDialog("Enter a name for your new random menu!");
				if(name.length() <= 0) {
					while(name.length() <= 0) {
						JOptionPane.showMessageDialog(null, "ERROR: You must enter a name for your menu");
						name = JOptionPane.showInputDialog("Enter a name for your brand new menu");
					}
				}
				Menu m = menu.randomMenu(name);
				l.addElement(m);
			}
		});
		
		
		//event action listener for minimum button
		btnMinMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Generate a Minimum Calories Menu button pressed!\n");
				String name = JOptionPane.showInputDialog("Enter a name for your new minimum calories menu!");
				if(name.length() <= 0) {
					while(name.length() <= 0) {
						JOptionPane.showMessageDialog(null, "ERROR: You must enter a name for your menu");
						name = JOptionPane.showInputDialog("Enter a name for your brand new menu");
					}
				}
				Menu m = menu.minCalories(name);
				l.addElement(m);
			}
		});
		
		
		//creating event action listener for max button
		btnMaxMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Generate Maximum Calories Menu button Pressed!\n");
				String name = JOptionPane.showInputDialog("Enter a name for your new maximum calories menu!");
				Menu m = menu.maxCalories(name);
				l.addElement(m);
			}
		});


		//action event listener for details button
		btnDetails.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Details Pressed!\n");
				Menu selected = listCreatedMenus.getSelectedValue();
				
				if(l.size() == 0) {
					JOptionPane.showMessageDialog(null, "You Must Create a Menu First!");
				} else if (listCreatedMenus.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "Please Select a Menu to View It's Details");
				} else {
					
					JFrame frmDetails = new JFrame("Menu: " + selected);
					frmDetails.setBounds(frmMain.getX() + 175, frmMain.getY() - 100, 1920/2 - 70, 1080/2 + 150);
					frmDetails.getContentPane().setLayout(null);
					
					////Creating components for frmDetails
					//entree 
					//entree label
					JLabel lblEntreeDetails = new JLabel("Entree");
					lblEntreeDetails.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblEntreeDetails.setBounds(40, 30, 100, 30);
					frmDetails.add(lblEntreeDetails);
					
					//entree text Box
					JTextArea txtEntreeDetails = new JTextArea(selected.getEntree().getName() + "\n" + selected.getEntree().getDescription());
					txtEntreeDetails.setFont(new Font("Verdanna", Font.BOLD, 15));
					txtEntreeDetails.setBounds(40, 65, 800, 90);
					txtEntreeDetails.setLineWrap(true);
					txtEntreeDetails.setBorder(BorderFactory.createLineBorder(Color.black));
					txtEntreeDetails.setEditable(false);
					frmDetails.add(txtEntreeDetails);
					
					
					//side
					//side label
					JLabel lblSideDetails = new JLabel("Side");
					lblSideDetails.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblSideDetails.setBounds(40, 155, 100, 30);
					frmDetails.add(lblSideDetails);
					
					//side text area
					JTextArea txtSideDetails = new JTextArea(selected.getSide().getName() + "\n" + selected.getSide().getDescription());
					txtSideDetails.setFont(new Font("Verdanna", Font.BOLD, 15));
					txtSideDetails.setBounds(40, 190, 800, 90);
					txtSideDetails.setLineWrap(true);
					txtSideDetails.setBorder(BorderFactory.createLineBorder(Color.black));
					txtSideDetails.setEditable(false);
					frmDetails.add(txtSideDetails);
					
					
					//salad
					//salad label
					JLabel lblSaladDetails = new JLabel("Salad");
					lblSaladDetails.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblSaladDetails.setBounds(40, 280, 100, 30);
					frmDetails.add(lblSaladDetails);
					
					//salad text area
					JTextArea txtSaladDetails = new JTextArea(selected.getSalad().getDescription());
					txtSaladDetails.setFont(new Font("Verdanna", Font.BOLD, 15));
					txtSaladDetails.setBounds(40, 315, 800, 90);
					txtSaladDetails.setLineWrap(true);
					txtSaladDetails.setBorder(BorderFactory.createLineBorder(Color.black));
					txtSaladDetails.setEditable(false);
					frmDetails.add(txtSaladDetails);
					
					
					
					//dessert
					//dessert label
					JLabel lblDessertDetails = new JLabel("Dessert");
					lblDessertDetails.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblDessertDetails.setBounds(40, 405, 100, 30);
					frmDetails.add(lblDessertDetails);
					
					
					//dessert text
					JTextArea txtDessertDetails = new JTextArea(selected.getDessert().getDescription());
					txtDessertDetails.setFont(new Font("Verdanna", Font.BOLD, 15));
					txtDessertDetails.setBounds(40, 440, 800, 90);
					txtDessertDetails.setLineWrap(true);
					txtDessertDetails.setBorder(BorderFactory.createLineBorder(Color.black));
					txtDessertDetails.setEditable(false);
					frmDetails.add(txtDessertDetails);
					
					//total calories
					int calories = selected.getDessert().getCalories() + selected.getSide().getCalories() + selected.getSalad().getCalories() + selected.getEntree().getCalories();
					//total calories label
					JLabel lblCalories = new JLabel("Calories:");
					lblCalories.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblCalories.setBounds(40, 570, 200, 30);
					frmDetails.add(lblCalories);
					
					
					//total calories text
					JTextArea txtCalories = new JTextArea("" + calories);
					txtCalories.setFont(new Font("Verdanna", Font.BOLD, 17));
					txtCalories.setBounds(130, 572, 200, 30);
					txtCalories.setBorder(BorderFactory.createLineBorder(Color.black));
					txtCalories.setEditable(false);
					frmDetails.add(txtCalories);
					
					
					//total price
					double price = selected.getDessert().getPrice() + selected.getSide().getPrice() + selected.getSalad().getPrice() + selected.getEntree().getPrice();
					//total price label
					JLabel lblPrice = new JLabel("Price: $");
					lblPrice.setFont(new Font("Verdanna", Font.BOLD, 18));
					lblPrice.setBounds(380, 570, 200, 30);
					frmDetails.add(lblPrice);
					
					
					//total price text
					JTextArea txtPrice = new JTextArea("" + price);
					txtPrice.setFont(new Font("Verdanna", Font.BOLD, 17));
					txtPrice.setBounds(450, 572, 200, 30);
					txtPrice.setBorder(BorderFactory.createLineBorder(Color.black));
					txtPrice.setEditable(false);
					frmDetails.add(txtPrice);
					
					
					frmDetails.setVisible(true);
				}
			}
		});


		//action event listener for delete all button
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete All button pressed!\n");
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ALL menus?\n" + "***THIS DECISION CAN NOT BE UNDONE***\n") 
					== JOptionPane.YES_OPTION) {
					
					if(l.size() > 0) {
						l.removeAllElements();
						JOptionPane.showMessageDialog(null, "All menus have been removed");
					} else {
						JOptionPane.showMessageDialog(null, "There are no menus to delete");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Deletion has been canceled");
				}
			}
		});
		
		
		//action event listener for save button
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Save to File button pressed!\n");
				ArrayList<Menu> newL = new ArrayList<Menu>();
				
				if(l.size() > 0){
					
					//looping through DefaultListModel l and converting to ArrayList
					for(int i = 0; i < l.size(); i++) {
						newL.add(l.get(i));				
					}
				
					FileManager.writeMenus("data\\menus.txt", newL);
					JOptionPane.showMessageDialog(null, "Menu(s) have been copied to file");
				} else {
					JOptionPane.showMessageDialog(null, "There are no menus to copy to file");
				}
			}
				
		});
				


		//starting main frame
		frmMain.getContentPane().add(lblCreatedMenus);
		frmMain.setVisible(true);
	}


}
