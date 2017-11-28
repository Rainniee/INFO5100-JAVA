/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author apple
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VehicleDetails extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JPanel leftPanel,rightPanel,pane1,pane2,pane3,pane4,pane5;
	JButton viewDetails1;
                //,viewDetails2,viewDetails3,viewDetails4,viewDetails5;
	JComboBox<String> filterYear,filterModel,filterMake,filterType,filterPrice,filterCategory,filterSort;
	JLabel topPicture,vehicleLabel,searchLabel,label1,label2,label3,label4,label5,priceLabel1,priceLabel2,priceLabel3,priceLabel4,priceLabel5;
	JTextField searchBar;

	public VehicleDetails(){
		super("Vehicle Details");
		setSize(1800,1000);
		setLocation(10,10);

		leftPanel = new JPanel();
		rightPanel = new JPanel();

		setLayout(new BorderLayout());
		add(leftPanel,BorderLayout.WEST);
		add(rightPanel,BorderLayout.CENTER);

		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(scrollPane,BorderLayout.EAST);

		leftPanel.setBackground(new Color(233,227,214));//(127,179,213)
		leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		rightPanel.setBackground(new Color(233,227,214));

		viewDetails1 = new JButton("Make Payments");
		viewDetails1.setBackground(new Color(118,161,203));
		viewDetails1.setBounds(10, 6, 10, 10);
		/**
                viewDetails2 = new JButton("View Details");
		viewDetails2.setBackground(new Color(127,179,213));
		viewDetails3 = new JButton("View Details");
		viewDetails3.setBackground(new Color(127,179,213));
		viewDetails4 = new JButton("View Details");
		viewDetails4.setBackground(new Color(127,179,213));
		viewDetails5 = new JButton("View Details");
		viewDetails5.setBackground(new Color(127,179,213));**/

		String[] year = {"Year:","<2014","2015","2016","2017",">2017"};
		filterYear = new JComboBox<String>(year);
		filterYear.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterYear);

		String[] model = {"Model:","Model1","Model2","Model3","Model4","Model5"};
		filterModel = new JComboBox<String>(model);
		filterModel.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterModel);

		String[] make = {"Make:","Make1","Make2","Make3","Make4","Make5"};
		filterMake = new JComboBox<String>(make);
		filterMake.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterMake);

		String[] type = {"Type:","Type1","Type2","Type3","Type4","Type5"};
		filterType = new JComboBox<String>(type);
		filterType.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterType);

		String[] price = {"Price:","0-10,000","10,000-20,000","20,000-30,000","30,000-40,000","40,000-50,000","50,000-60,000"};
		filterPrice = new JComboBox<String>(price);
		filterPrice.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterPrice);

		String[] category = {"Category:","Category1","Category2","Category3","Category4","Category5"};
		filterCategory = new JComboBox<String>(category);
		filterCategory.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterCategory);

		String[] sortBy = {"Sort By:","Year","Model","Make","Price","Category"};
		filterSort = new JComboBox<String>(sortBy);
		filterSort.setPreferredSize(new Dimension(110,30));
		leftPanel.add(filterSort);

		vehicleLabel = new JLabel("Search Vehicles");
		leftPanel.add(vehicleLabel);
		vehicleLabel.setFont(new Font("Serif", Font.PLAIN, 25));

		searchLabel = new JLabel("Search");
		rightPanel.add(searchLabel);
		searchLabel.setFont(new Font("Serif", Font.PLAIN, 22));

		//BufferedImage image = ImageIO.read(new File("path-to-file"));
		topPicture = new JLabel("Photo or Logo");
		topPicture.setFont(new Font("Serif", Font.PLAIN, 25));
		leftPanel.add(topPicture);

		label1 = new JLabel("Display specified photo");
		label1.setFont(new Font("Serif", Font.BOLD, 22));

		label2 = new JLabel("Display vehicle photo");
		label2.setFont(new Font("Serif", Font.BOLD, 22));

		label3 = new JLabel("Display vehicle photo");
		label3.setFont(new Font("Serif", Font.BOLD, 22));

		label4 = new JLabel("Display vehicle photo");
		label4.setFont(new Font("Serif", Font.BOLD, 22));

		label5 = new JLabel("DESCRIPTION");
		label5.setFont(new Font("Serif", Font.BOLD, 22));
		
		
		priceLabel1 = new JLabel("$28,000");priceLabel1.setFont(new Font("Serif", Font.ITALIC, 20));
		priceLabel2 = new JLabel("Front View");priceLabel2.setFont(new Font("Serif", Font.ITALIC, 20));
		priceLabel3 = new JLabel("Side Elevation");priceLabel3.setFont(new Font("Serif", Font.ITALIC, 20));
		priceLabel4 = new JLabel("Backside Elevation");priceLabel4.setFont(new Font("Serif", Font.ITALIC, 20));
		priceLabel5 = new JLabel("MORE DETAILS");priceLabel5.setFont(new Font("Serif", Font.BOLD, 18));

		searchBar= new JTextField(30);

		JPanel headerPane = new JPanel();
		headerPane.setBackground(new Color(235,245,251));
		headerPane.setPreferredSize(new Dimension(1000, 10));

		JPanel pane1 = new JPanel();
		pane1.setBackground(new Color(235,245,251));
		pane1.setPreferredSize(new Dimension(1000, 120));

		JPanel pane2 = new JPanel();
		pane2.setBackground(new Color(235,245,251));
		pane2.setPreferredSize(new Dimension(1000, 120));

		JPanel pane3 = new JPanel();
		pane3.setBackground(new Color(235,245,251));
		pane3.setPreferredSize(new Dimension(1000, 120));

		JPanel pane4 = new JPanel();
		pane4.setBackground(new Color(235,245,251));
		pane4.setPreferredSize(new Dimension(1000, 120));

		JPanel pane5 = new JPanel();
		pane5.setBackground(new Color(235,245,251));
		pane5.setPreferredSize(new Dimension(1000, 120));

		JPanel topPane = new JPanel();
		topPane.setBackground(new Color(235,245,251));
		topPane.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		topPane.setPreferredSize(new Dimension(1000, 30));
		
		JButton homeBtn = new JButton("Home");
		homeBtn.setBackground(new Color(118,161,203));
		JButton	contactUsBtn = new JButton("Contact Us");
		contactUsBtn.setBackground(new Color(118,161,203));
		JButton newVehiclesBtn = new JButton("New Vehicles");
		newVehiclesBtn.setBackground(new Color(118,161,203));
		JButton viewDealersBtn = new JButton("View Dealers");
		viewDealersBtn.setBackground(new Color(118,161,203));
		
		topPane.setLayout( new FlowLayout(FlowLayout.CENTER, 150, 4) );
		
		topPane.add(homeBtn);
		topPane.add(newVehiclesBtn);
		topPane.add(viewDealersBtn);
		topPane.add(contactUsBtn);

		rightPanel.add(pane1);
		rightPanel.add(pane2);
		rightPanel.add(pane3);
		rightPanel.add(pane4);
		rightPanel.add(pane5);

		leftPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.insets = new Insets(30,30,2,5);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weightx = 0.5;
		gc.weighty = 0.5;

		gc.gridx = 0;gc.gridy = 2;
		leftPanel.add(topPicture,gc);

		gc.gridx = 0;gc.gridy = 3;
		leftPanel.add(vehicleLabel,gc);

		gc.gridx = 0;gc.gridy = 4;
		leftPanel.add(filterYear,gc);

		gc.gridx = 0;gc.gridy = 5;
		leftPanel.add(filterModel,gc);

		gc.gridx = 0;gc.gridy = 6;
		leftPanel.add(filterMake,gc);

		gc.gridx = 0;gc.gridy = 7;
		leftPanel.add(filterType,gc);

		gc.gridx = 0;gc.gridy = 8;
		leftPanel.add(filterPrice,gc);

		gc.gridx = 0;gc.gridy = 9;
		leftPanel.add(filterCategory,gc);

		gc.weighty = 15;
		gc.gridx = 0;gc.gridy = 10;
		leftPanel.add(filterSort,gc);


		rightPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc2 = new GridBagConstraints();

		gc2.insets = new Insets(3,3,2,5);

		gc2.weightx = 0.5;gc2.weighty = 0.5;
		
	

		gc2.anchor = GridBagConstraints.LAST_LINE_END;
		gc2.gridx = 10;gc2.gridy = 0;
		rightPanel.add(searchBar,gc2);
		
		gc2.anchor = GridBagConstraints.LAST_LINE_START;
		gc2.gridx = 11;gc2.gridy = 0;
		rightPanel.add(searchLabel,gc2);

		gc2.anchor = GridBagConstraints.EAST;
		
		gc2.anchor = GridBagConstraints.NORTH;
		gc2.gridx = 10;gc2.gridy = 1;
		rightPanel.add(topPane,gc2);

		gc2.gridx = 10;gc2.gridy = 8;
		rightPanel.add(pane1,gc2);

		gc2.gridx = 10;gc2.gridy = 10;
		rightPanel.add(pane2,gc2);

		gc2.gridx = 10;gc2.gridy = 12;
		rightPanel.add(pane3,gc2);

		gc2.gridx = 10;gc2.gridy = 14;
		rightPanel.add(pane4,gc2);

		gc2.gridx = 10;gc2.gridy = 16;
		rightPanel.add(pane5,gc2);

		pane1.setLayout(new GridBagLayout());
		GridBagConstraints gc3 = new GridBagConstraints();
		gc3.anchor = GridBagConstraints.LAST_LINE_START;
		gc3.insets = new Insets(2,180,4,2);
		gc3.gridx = 3;gc3.gridy = 5;
		pane1.add(label1,gc3);
		gc3.gridx = 4;gc3.gridy = 5;
		pane1.add(priceLabel1,gc3);
		gc3.anchor = GridBagConstraints.LAST_LINE_END;
		gc3.gridx = 8;gc3.gridy = 5;
		pane1.add(viewDetails1,gc3);
		
		pane2.setLayout(new GridBagLayout());
		GridBagConstraints gc4 = new GridBagConstraints();
		gc4.anchor = GridBagConstraints.LAST_LINE_START;
		gc4.insets = new Insets(2,180,4,2);
		gc4.gridx = 3;gc4.gridy = 6;
		pane2.add(label2,gc4);
		gc4.gridx = 4;gc3.gridy = 6;
		pane2.add(priceLabel2,gc4);
		gc4.anchor = GridBagConstraints.LAST_LINE_END;
		gc4.gridx = 8;gc4.gridy = 6;
		//pane2.add(viewDetails2,gc4);

		pane3.setLayout(new GridBagLayout());
		GridBagConstraints gc5 = new GridBagConstraints();
		gc5.anchor = GridBagConstraints.LAST_LINE_START;
		gc5.insets = new Insets(2,180,4,2);
		gc5.gridx = 3;gc5.gridy = 7;
		pane3.add(label3,gc5);
		gc5.gridx = 4;gc5.gridy = 7;
		pane3.add(priceLabel3,gc5);
		gc5.anchor = GridBagConstraints.LAST_LINE_END;
		gc5.gridx = 8;gc5.gridy = 7;
		//pane3.add(viewDetails3,gc5);

		pane4.setLayout(new GridBagLayout());
		GridBagConstraints gc6 = new GridBagConstraints();
		gc6.anchor = GridBagConstraints.LAST_LINE_START;
		gc6.insets = new Insets(2,180,4,2);
		gc6.gridx = 3;gc6.gridy = 8;
		pane4.add(label4,gc6);
		gc6.gridx = 4;gc6.gridy = 8;
		pane4.add(priceLabel4,gc6);
		gc6.anchor = GridBagConstraints.LAST_LINE_END;
		gc6.gridx = 8;gc6.gridy = 8;
		//pane4.add(viewDetails4,gc6);

		pane5.setLayout(new GridBagLayout());
		GridBagConstraints gc7 = new GridBagConstraints();
		gc7.anchor = GridBagConstraints.LAST_LINE_START;
		gc7.insets = new Insets(2,180,4,2);
		gc7.gridx = 3;gc7.gridy = 9;
		pane5.add(label5,gc7);
		gc7.gridx = 4;gc7.gridy = 9;
		pane5.add(priceLabel5,gc7);
		gc7.anchor = GridBagConstraints.LAST_LINE_END;
		gc7.gridx = 8;gc7.gridy = 9;
		//pane5.add(viewDetails5,gc7);
                
 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new VehicleDetails();

			}

		});


	}




}