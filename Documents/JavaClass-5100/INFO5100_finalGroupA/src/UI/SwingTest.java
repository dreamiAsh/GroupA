import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTest {

	public static void main(String[] args) {
		new DealerLogin();
	}

}

class DealerLogin extends JFrame {
	public DealerLogin() {
		Container container = getContentPane();
		
		JPanel Left = new JPanel(new GridLayout(2, 1, 30, 30));
		JLabel DealerIDLabel = new JLabel("DealerID:");
		JLabel DealerNameLabel = new JLabel("DealerName:");
		Left.add(DealerNameLabel);
		Left.add(DealerIDLabel);
		Left.setBounds(70, 70, 120, 80);
		container.add(Left);
		
		
		JPanel Right = new JPanel(new GridLayout(2, 1, 30, 30));
		JTextField DealerIDText = new JTextField();
		JTextField DealerNameText = new JTextField();
		Right.add(DealerIDText);
		Right.add(DealerNameText);
		Right.setBounds(180, 70, 150, 80);
		container.add(Right);
		
		
		JPanel b = new JPanel(null);
		JButton LoginButton = new JButton("Login");
		LoginButton.setFocusPainted(false);
		LoginButton.setBounds(150, 200, 90, 30);
		b.add(LoginButton);
		container.add(b);
		
		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchFrame();
				setVisible(false);
			}
		});
		

		setSize(400, 300);
	    int windowWidth = this.getWidth();
	    int windowHeight = this.getHeight();   
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    int screenWidth = screenSize.width;
	    int screenHeight = screenSize.height;
	    this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
	    
		setTitle("Login");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class SearchFrame extends JFrame {
	public SearchFrame() {
		Container container = getContentPane();
		container.setLayout(null);
		
		JPanel SearchPanel = new JPanel(null);
		JTextField SearchText = new JTextField();
		JButton SearchButton = new JButton("Search");
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		SearchText.setBounds(300, 10, 900, 40);
		SearchButton.setBounds(1200, 10, 100, 38);
		SearchPanel.add(SearchText);
		SearchPanel.add(SearchButton);
		
		
		JPanel LeftList = new JPanel(null);
		JList<String> List = new JList<>(new InventoryList());
		List.setFont(new Font("Courier New", Font.BOLD ,24));
		JScrollPane ListPane = new JScrollPane(List);
		ListPane.setBounds(20, 20, 700, 600);
		LeftList.add(ListPane);

		JPanel RightButtons = new JPanel(new GridLayout(3, 1, 0, 20));
		JButton AddButton = new JButton("Add");
		JButton ModifyButton = new JButton("Modify");
		JButton DeleteButton = new JButton("Delete");
		RightButtons.add(AddButton);
		RightButtons.add(ModifyButton);
		RightButtons.add(DeleteButton);
		
		SearchPanel.setBounds(0, 0, 1600, 60);
		LeftList.setBounds(20, 100, 800, 900);
		RightButtons.setBounds(827, 600, 100, 150);
		
		container.add(SearchPanel);
		container.add(LeftList);
		container.add(RightButtons);
		
		
		setSize(1600, 900);
		setTitle("Main Frame");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		//Jump to Add Page
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddPage();
				setVisible(false);
			}
		});
		
		//Jump to Modify Page
		ModifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifyPage();
				setVisible(false);
			}
		});
		
	}
}


/*
 * 
 *AddPage
 *  
 */

class AddPage extends JFrame{
	public AddPage() {
		Container container = getContentPane();
		container.setLayout(null);
		
		
		JPanel top = new JPanel(new GridLayout(2, 1, 30, 30));
		top.setBounds(50, 70, 300, 80);
		top.setLocation(350, 120);
		JPanel main = new JPanel(new GridLayout(2, 1, 30, 30));
		main.setBounds(180, 70, 300, 80);
		main.setLocation(350, 230);
		JPanel bottom = new JPanel(new GridLayout(2, 1, 30, 30));
		bottom.setBounds(100, 70, 300, 200);
		bottom.setLocation(350, 340);
		
		//Brand
		JLabel BrandLabel = new JLabel("Brand:");
		JTextField BrandText = new JTextField();
		//Model
		JLabel ModelLabel = new JLabel("Model:");
		JTextField ModelText = new JTextField();
		//Price
		JLabel PriceLabel = new JLabel("Price:");
		JTextField PriceText = new JTextField();
		//Year
		JLabel YearLabel = new JLabel("Year:");
		JTextField YearText = new JTextField();
		//Category
		JLabel CategoryLabel = new JLabel("Category:");
		JTextField CategoryText = new JTextField();
		//Detail
		JLabel DetailLabel = new JLabel("Detail:");
		JTextField DetailText = new JTextField();
		
		//Submit
		JButton submitButton = new JButton("Add");
		submitButton.setFocusPainted(false);
		submitButton.setBounds(150, 200, 90, 30);
		submitButton.setLocation(440, 590);
		
		top.add(BrandLabel);
		top.add(BrandText);
		top.add(ModelLabel);
		top.add(ModelText);
		main.add(PriceLabel);
		main.add(PriceText);
		main.add(YearLabel);
		main.add(YearText);
		bottom.add(CategoryLabel);
		bottom.add(CategoryText);
		bottom.add(DetailLabel);
		bottom.add(DetailText);
		

		container.add(top);
		container.add(main);
		container.add(bottom);
		container.add(submitButton);
		
		
		setSize(1000, 800);
		setTitle("Add Page");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}
}

/*
 * 
 *ModifyPage
 *  
 */
class ModifyPage extends JFrame{
	public ModifyPage() {
		Container container = getContentPane();
		container.setLayout(null);
		
		
		JPanel top = new JPanel(new GridLayout(2, 1, 30, 30));
		top.setBounds(50, 70, 300, 80);
		top.setLocation(350, 120);
		JPanel main = new JPanel(new GridLayout(2, 1, 30, 30));
		main.setBounds(180, 70, 300, 80);
		main.setLocation(350, 230);
		JPanel bottom = new JPanel(new GridLayout(2, 1, 30, 30));
		bottom.setBounds(100, 70, 300, 200);
		bottom.setLocation(350, 340);
		
		//Brand
		JLabel BrandLabel = new JLabel("Brand:");
		JTextField BrandText = new JTextField();
		//Model
		JLabel ModelLabel = new JLabel("Model:");
		JTextField ModelText = new JTextField();
		//Price
		JLabel PriceLabel = new JLabel("Price:");
		JTextField PriceText = new JTextField();
		//Year
		JLabel YearLabel = new JLabel("Year:");
		JTextField YearText = new JTextField();
		//Category
		JLabel CategoryLabel = new JLabel("Category:");
		JTextField CategoryText = new JTextField();
		//Detail
		JLabel DetailLabel = new JLabel("Detail:");
		JTextField DetailText = new JTextField();
		
		//Submit
		JButton submitButton = new JButton("Modify");
		submitButton.setFocusPainted(false);
		submitButton.setBounds(150, 200, 90, 30);
		submitButton.setLocation(440, 590);
		
		top.add(BrandLabel);
		top.add(BrandText);
		top.add(ModelLabel);
		top.add(ModelText);
		main.add(PriceLabel);
		main.add(PriceText);
		main.add(YearLabel);
		main.add(YearText);
		bottom.add(CategoryLabel);
		bottom.add(CategoryText);
		bottom.add(DetailLabel);
		bottom.add(DetailText);
		

		container.add(top);
		container.add(main);
		container.add(bottom);
		container.add(submitButton);
		
		
		setSize(1000, 800);
		setTitle("Modify Page");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}
}





class InventoryList extends AbstractListModel {
	
	@Override
	public Object getElementAt(int num) {
		return num < 20 ? "Car" : null;
	}
	
	@Override
	public int getSize() {
		return 20;
	}
}

class CarDetails extends JDialog {
	
}

