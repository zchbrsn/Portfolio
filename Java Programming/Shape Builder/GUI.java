//Student: Zachary Burson
//Course: UMGC CMSC335
//Assignment: Project 2
//Date: 14 Sep 2021
//Description: GUI components and action events

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends Component {

	public GUI () {
		JFrame frame = new JFrame("Shape Builder");
		JFrame shapeFrame = new JFrame("Shape");
		JPanel panel = new JPanel(new GridBagLayout());
		String[] shapes = {"Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus"};
		JLabel shapeLabel = new JLabel("Select a shape");
		JComboBox<String> selection = new JComboBox<String>(shapes);
		JButton select = new JButton("Select");
		
		//Hidden parameters
		JTextField input1 = new JTextField(5);
		input1.setVisible(false);
		JTextField input2 = new JTextField(5);
		input2.setVisible(false);
		JLabel paramsLabel1 = new JLabel();
		paramsLabel1.setVisible(false);
		JLabel paramsLabel2 = new JLabel();
		paramsLabel2.setVisible(false);
		JButton create = new JButton("Create");
		create.setVisible(false);
		JLabel resultLabel = new JLabel("Result: ");
		resultLabel.setVisible(false);
		JTextField resultField = new JTextField(20);
		resultField.setVisible(false);
		resultField.setEditable(false);
		
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(shapeLabel, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(selection, c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(select, c);
								
		c.gridx = 4;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(create, c);
		
		c.gridx = 4;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(input1, c);
		
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(paramsLabel1, c);
		
		c.gridx = 4;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(input2, c);
		
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(paramsLabel2, c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(resultLabel, c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(resultField, c);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.add(panel);
		frame.setVisible(true);
		shapeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		shapeFrame.setSize(1024, 768);
		shapeFrame.setLocationRelativeTo(null);
		
	select.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selectedItem = (String) selection.getSelectedItem();
			switch(selectedItem) {
			case "Circle": 
				paramsLabel2.setVisible(false);
				input2.setVisible(false);
				paramsLabel1.setText("Enter Radius:");
				paramsLabel1.setVisible(true);
				break;
			case "Square":
				paramsLabel2.setVisible(false);
				input2.setVisible(false);
				paramsLabel1.setText("Enter Edge:");
				paramsLabel1.setVisible(true);
				break;
			case "Triangle":
				paramsLabel1.setText("Enter Base: ");
				paramsLabel1.setVisible(true);
				paramsLabel2.setText("Enter Height: ");
				paramsLabel2.setVisible(true);
				input2.setVisible(true);
				break;
			case "Rectangle":
				paramsLabel1.setText("Enter Length: ");
				paramsLabel1.setVisible(true);
				paramsLabel2.setText("Enter Width: ");
				paramsLabel2.setVisible(true);
				input2.setVisible(true);
				break;
			case "Sphere":
				paramsLabel2.setVisible(false);
				input2.setVisible(false);
				paramsLabel1.setText("Enter Radius:");
				paramsLabel1.setVisible(true);
				break;
			case "Cube":
				paramsLabel2.setVisible(false);
				input2.setVisible(false);
				paramsLabel1.setText("Enter Edge:");
				paramsLabel1.setVisible(true);
				break;
			case "Cone":
				paramsLabel1.setText("Enter Radius: ");
				paramsLabel1.setVisible(true);
				paramsLabel2.setText("Enter Height: ");
				paramsLabel2.setVisible(true);
				input2.setVisible(true);
				break;
			case "Cylinder":
				paramsLabel1.setText("Enter Radius: ");
				paramsLabel1.setVisible(true);
				paramsLabel2.setText("Enter Height: ");
				paramsLabel2.setVisible(true);
				input2.setVisible(true);
				break;
			case "Torus":
				paramsLabel1.setText("Enter MajRadius: ");
				paramsLabel1.setVisible(true);
				paramsLabel2.setText("Enter MinRadius: ");
				paramsLabel2.setVisible(true);
				input2.setVisible(true);
				break;
			}
			input1.setVisible(true);
			create.setVisible(true);
		}
	});
	
	create.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selectedItem = (String) selection.getSelectedItem();
			shapeFrame.getContentPane().removeAll();
			shapeFrame.revalidate();
			try {
				switch(selectedItem) {
				case "Circle": 
					double radius = Integer.parseInt(input1.getText());
					if (radius > 0) {
						Circle circle = new Circle(radius*2, radius*2);
						resultField.setText(String.valueOf(circle.area(radius)));
						shapeFrame.add(circle);
						shapeFrame.repaint();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Square":
					double edge = Double.parseDouble(input1.getText());
					if (edge > 0) {
						Square square = new Square(edge, edge);
						resultField.setText(String.valueOf(square.area(edge)));
						shapeFrame.add(square);
						shapeFrame.repaint();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Triangle":
					double base = Double.parseDouble(input1.getText());
					double height = Double.parseDouble(input2.getText());
					if (base > 0 && height > 0) {
						Triangle triangle = new Triangle(base, height);
						resultField.setText(String.valueOf(triangle.area(base, height)));
						shapeFrame.add(triangle);
						shapeFrame.repaint();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Rectangle":
					double length = Double.parseDouble(input1.getText());
					double width = Double.parseDouble(input2.getText());
					if (length > 0 && width > 0) {
						Rectangle rectangle = new Rectangle(length, width);
						resultField.setText(String.valueOf(rectangle.area(length, width)));
						shapeFrame.add(rectangle);
						shapeFrame.repaint();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Sphere":
					double sphereRadius = Double.parseDouble(input1.getText());
					if (sphereRadius > 0) {
						Sphere sphere = new Sphere();
						resultField.setText(String.valueOf(sphere.volume(sphereRadius)));
						shapeFrame.add(new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/Sphere.jpg")));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Cube":
					double cubeEdge = Double.parseDouble(input1.getText());
					if (cubeEdge > 0) {
						Cube cube = new Cube();
						resultField.setText(String.valueOf(cube.volume(cubeEdge)));
						shapeFrame.add(new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/Cube.jpg")));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Cone":
					double conRadius = Double.parseDouble(input1.getText());
					double conHeight = Double.parseDouble(input2.getText());
					if (conRadius > 0 && conHeight > 0) {
						Cone cone = new Cone();
						resultField.setText(String.valueOf(cone.volume(conRadius, conHeight)));
						shapeFrame.add(new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/Cone.jpg")));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Cylinder":
					double cylRadius = Double.parseDouble(input1.getText());
					double cylHeight = Double.parseDouble(input2.getText());
					if (cylRadius > 0 && cylHeight > 0) {
						Cylinder cylinder = new Cylinder();
						resultField.setText(String.valueOf(cylinder.volume(cylRadius, cylHeight)));
						shapeFrame.add(new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/Cylinder.jpg")));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Torus":
					double majRadius = Double.parseDouble(input1.getText());
					double minRadius = Double.parseDouble(input2.getText());
					if (majRadius > 0 && minRadius > 0  && majRadius > minRadius) {
						Torus torus = new Torus();
						resultField.setText(String.valueOf(torus.volume(majRadius, minRadius)));
						shapeFrame.add(new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/Torus.jpg")));
					}
					else {
						JOptionPane.showMessageDialog(frame, "Please enter positive numeric values and ensure that Major radius > Minor radius", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					break;
				}
				resultLabel.setVisible(true);
				resultField.setVisible(true);
				paramsLabel1.setVisible(false);
				paramsLabel2.setVisible(false);
				shapeFrame.setVisible(true);
			}
			catch(Exception a) {
				JOptionPane.showMessageDialog(frame, "Please enter only numeric values in the field(s).", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	});

	}
}
