package java_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class java_project extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField stack_push;
	private JTextField queue_add;
	private JTextField error;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					java_project frame = new java_project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public java_project() {
		setBackground(Color.LIGHT_GRAY);
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0, 0);
		list.add(1, 1);
		list.add(2, 2);
		list.add(3, 3);
		list.add(4, 4);
		list.add(5, 5);
		list.add(6, 6);
		list.add(7, 7);
		list.add(8, 8);
		list.add(9, 9);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(596, 126, 46, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(544, 126, 46, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(488, 126, 46, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(431, 126, 46, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(375, 126, 46, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(319, 126, 46, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(263, 126, 46, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(207, 126, 46, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(151, 126, 46, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(95, 126, 46, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		stack_push = new JTextField();
		stack_push.setBounds(53, 282, 200, 20);
		contentPane.add(stack_push);
		stack_push.setColumns(10);

		queue_add = new JTextField();
		queue_add.setBounds(431, 282, 200, 20);
		contentPane.add(queue_add);
		queue_add.setColumns(10);
		JLabel lblNewLabel = new JLabel(" 0");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(596, 97, 46, 14);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel1 = new JLabel(" 1");
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel1.setBounds(544, 97, 46, 14);
		contentPane.add(lblNewLabel1);
		JLabel lblNewLabel2 = new JLabel(" 2");
		lblNewLabel2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel2.setBounds(488, 97, 46, 14);
		contentPane.add(lblNewLabel2);
		JLabel lblNewLabel3 = new JLabel(" 3");
		lblNewLabel3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel3.setBounds(431, 97, 46, 14);
		contentPane.add(lblNewLabel3);
		JLabel lblNewLabel4 = new JLabel(" 4");
		lblNewLabel4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel4.setBounds(375, 97, 46, 14);
		contentPane.add(lblNewLabel4);
		JLabel lblNewLabel5 = new JLabel(" 5");
		lblNewLabel5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel5.setBounds(319, 97, 46, 14);
		contentPane.add(lblNewLabel5);
		JLabel lblNewLabel6 = new JLabel(" 6");
		lblNewLabel6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel6.setBounds(263, 97, 46, 14);
		contentPane.add(lblNewLabel6);
		JLabel lblNewLabel7 = new JLabel(" 7");
		lblNewLabel7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel7.setBounds(207, 97, 46, 14);
		contentPane.add(lblNewLabel7);
		JLabel lblNewLabel8 = new JLabel(" 8");
		lblNewLabel8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel8.setBounds(151, 97, 46, 14);
		contentPane.add(lblNewLabel8);
		JLabel lblNewLabel9 = new JLabel(" 9");
		lblNewLabel9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel9.setBounds(95, 97, 46, 14);
		contentPane.add(lblNewLabel9);

		textField.setText(list.get(0).toString());
		textField_1.setText(list.get(1).toString());
		textField_2.setText(list.get(2).toString());
		textField_3.setText(list.get(3).toString());
		textField_4.setText(list.get(4).toString());
		textField_5.setText(list.get(5).toString());
		textField_6.setText(list.get(6).toString());
		textField_7.setText(list.get(7).toString());
		textField_8.setText(list.get(8).toString());
		textField_9.setText(list.get(9).toString());
		JRadioButton stack = new JRadioButton("STACK");
		stack.setBounds(53, 227, 200, 23);
		contentPane.add(stack);

		JRadioButton queue = new JRadioButton(" QUEUE");
		queue.setBounds(431, 227, 200, 23);
		contentPane.add(queue);
		ButtonGroup option = new ButtonGroup();
		option.add(queue);
		option.add(stack);

		JButton btnNewButton = new JButton(" PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (stack_push.getText().toString().isBlank() != true) {
					if (stack.isSelected() && list.size() < 10) {
						list.addLast(Integer.valueOf(stack_push.getText()));
						if (list.size() == 10) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText(list.get(8).toString());
							textField_9.setText(list.get(9).toString());
							error.setText(" Data pused Successfully");
						} else if (list.size() == 9) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText(list.get(8).toString());
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 8) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 7) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 6) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 5) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 4) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 3) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 2) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 1) {
							textField.setText(list.get(0).toString());
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data pused Successfully");
						} else if (list.size() == 0) {
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
						}
					} else if (stack.isSelected() == false) {
						error.setText("Please select the Stack RadioButton");
					} else {
						error.setText("Stack is FULL please pop!");
					}
				} else {
					error.setText("please Enter the element! & Select RadioButton");
				}

			}
		});
		btnNewButton.setBounds(52, 313, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton(" POP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (stack.isSelected() && list.size() > 0) {
					list.removeLast();
					if (list.size() == 9) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText(list.get(7).toString());
						textField_8.setText(list.get(8).toString());
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 8) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText(list.get(7).toString());
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 7) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 6) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 5) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 4) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 3) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 2) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 1) {
						textField.setText(list.get(0).toString());
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data poped successfully");
					} else if (list.size() == 0) {
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("The Stack is Empty");
					}

				} else {
					error.setText("Please Select the Stack RadioButton");
				}
			}
		});
		btnNewButton_1.setBounds(164, 313, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (queue_add.getText().toString().isBlank() != true) {
					if (queue.isSelected() && list.size() < 10) {
						list.addLast(Integer.valueOf(queue_add.getText()));
						if (list.size() == 10) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText(list.get(8).toString());
							textField_9.setText(list.get(9).toString());
							error.setText(" Data Added Successfully");
						} else if (list.size() == 9) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText(list.get(8).toString());
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 8) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText(list.get(7).toString());
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 7) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText(list.get(6).toString());
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 6) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText(list.get(5).toString());
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 5) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText(list.get(4).toString());
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 4) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText(list.get(3).toString());
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 3) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText(list.get(2).toString());
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 2) {
							textField.setText(list.get(0).toString());
							textField_1.setText(list.get(1).toString());
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 1) {
							textField.setText(list.get(0).toString());
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
							error.setText(" Data Added Successfully");
						} else if (list.size() == 0) {
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							textField_6.setText("");
							textField_7.setText("");
							textField_8.setText("");
							textField_9.setText("");
						}
					} else if (queue.isSelected() == false) {
						error.setText("Please select the Queue RadioButton");
					} else {
						error.setText("Queue is FULL please Delete!");
					}
				} else {
					error.setText("please Enter the element! & Select QueueButton");
				}
			}
		});
		btnNewButton_2.setBounds(431, 313, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton(" DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (queue.isSelected() && list.size() > 0) {
					list.pop();
					if (list.size() == 9) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText(list.get(7).toString());
						textField_8.setText(list.get(8).toString());
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 8) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText(list.get(7).toString());
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 7) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText(list.get(6).toString());
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 6) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText(list.get(5).toString());
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 5) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText(list.get(4).toString());
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 4) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText(list.get(3).toString());
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 3) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText(list.get(2).toString());
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 2) {
						textField.setText(list.get(0).toString());
						textField_1.setText(list.get(1).toString());
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 1) {
						textField.setText(list.get(0).toString());
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("Data Deleted successfully");
					} else if (list.size() == 0) {
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						error.setText("The Queue is Empty");
					}

				} else {
					error.setText("Please Select the Queue RadioButton");
				}
			}
		});
		btnNewButton_3.setBounds(544, 313, 89, 23);
		contentPane.add(btnNewButton_3);

		error = new JTextField();
		error.setBackground(new Color(255, 255, 204));
		error.setFont(new Font("Times New Roman", Font.BOLD, 15));
		error.setBounds(10, 11, 664, 62);
		contentPane.add(error);
		error.setColumns(10);
		error.setText(" WELLCOME To Advance Java Project Using Java Collections Framework (JCF) ");

		JLabel lblNewLabel_1 = new JLabel(" Index");
		lblNewLabel_1.setBounds(39, 98, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Data");
		lblNewLabel_2.setBounds(39, 129, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Push Data");
		lblNewLabel_3.setBounds(53, 257, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Add Data");
		lblNewLabel_4.setBounds(431, 257, 86, 14);
		contentPane.add(lblNewLabel_4);

	}
}
