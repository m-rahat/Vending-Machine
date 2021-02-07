import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Machine {

	protected Shell shell;

	boolean itemSelected = false;
	String itemName = "";
	double itemPrice = 0;
	boolean atCheckout = false;
	double amountPaid = 0;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Machine window = new Machine();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		shell.setSize(600, 700);
		shell.setText("Vending Machine");

		Label lblPleaseSelectAn = new Label(shell, SWT.BORDER | SWT.WRAP);
		lblPleaseSelectAn.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblPleaseSelectAn.setBounds(359, 31, 133, 123);
		lblPleaseSelectAn.setText("Please Select an Item to view price");

		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBounds(34, 31, 297, 211);
		// ALL THE BUTTONS ARE HERE
		Button btnApple = new Button(canvas, SWT.RADIO);
		Button btnBananas = new Button(canvas, SWT.RADIO);
		Button btnRadioButton = new Button(canvas, SWT.RADIO);
		Button btnRadioButton_1 = new Button(canvas, SWT.RADIO);

		Label lblDispenser = new Label(shell, SWT.NONE);
		Label lblChange = new Label(shell, SWT.NONE);
		Label lblChangeAmountTxt = new Label(shell, SWT.NONE);
		Label lblAmountPaid = new Label(shell, SWT.NONE);
		Label lblAmountPaidTxt = new Label(shell, SWT.NONE);

		btnApple.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {

				if (!atCheckout) {

					btnApple.setSelection(true);

					lblPleaseSelectAn.setText("YOU SELECTED AN APPLE" + "\n" + "Price $1.50");
					btnApple.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
					btnApple.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 20, SWT.BOLD));

					btnBananas.setSelection(false);
					btnRadioButton.setSelection(false);
					btnRadioButton_1.setSelection(false);

					btnBananas.setFont(null);
					btnBananas.setForeground(null);
					btnRadioButton.setFont(null);
					btnRadioButton.setForeground(null);
					btnRadioButton_1.setFont(null);
					btnRadioButton_1.setForeground(null);

					itemSelected = true;
					itemName = btnApple.getText();
					itemPrice = 1.50;

				} // if
				else {
					lblPleaseSelectAn
							.setText("Please finish checkout process or hit CANCEL to select a different Item");
					btnApple.setSelection(false);
				} // else

			}// mouseDown
		});
		btnApple.setBounds(22, 47, 177, 18);
		btnApple.setText("APPLE");

		btnBananas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				if (!atCheckout) {
					btnBananas.setSelection(true);

					lblPleaseSelectAn.setText("YOU SELECTED A BANANA" + "\n" + "Price 50 cents");
					btnBananas.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
					btnBananas.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 20, SWT.BOLD));

					btnApple.setSelection(false);
					btnRadioButton.setSelection(false);
					btnRadioButton_1.setSelection(false);

					btnApple.setFont(null);
					btnApple.setForeground(null);
					btnRadioButton.setFont(null);
					btnRadioButton.setForeground(null);
					btnRadioButton_1.setFont(null);
					btnRadioButton_1.setForeground(null);

					itemSelected = true;
					itemName = btnBananas.getText();
					itemPrice = 0.50;
				} // if
				else {
					lblPleaseSelectAn
							.setText("Please finish checkout process or hit CANCEL to select a different Item");
					btnApple.setSelection(false);
				} // else
			}// mouseDown
		});
		btnBananas.setBounds(22, 88, 177, 18);
		btnBananas.setText("BANANAS");

		btnRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				if (!atCheckout) {
					btnRadioButton.setSelection(true);

					lblPleaseSelectAn.setText("YOU SELECTED A COOKIE" + "\n" + "Price $2.50");
					btnRadioButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
					btnRadioButton.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 20, SWT.BOLD));

					btnApple.setSelection(false);
					btnBananas.setSelection(false);
					btnRadioButton_1.setSelection(false);

					btnApple.setFont(null);
					btnApple.setForeground(null);
					btnBananas.setFont(null);
					btnBananas.setForeground(null);
					btnRadioButton_1.setFont(null);
					btnRadioButton_1.setForeground(null);

					itemSelected = true;
					itemName = btnRadioButton.getText();
					itemPrice = 2.50;
				} // if
				else {
					lblPleaseSelectAn
							.setText("Please finish checkout process or hit CANCEL to select a different Item");
					btnApple.setSelection(false);
				} // else
			}// mouseDown
		});
		btnRadioButton.setBounds(22, 10, 177, 18);
		btnRadioButton.setText("Cookies");

		btnRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				if (!atCheckout) {

					btnRadioButton_1.setSelection(true);

					lblPleaseSelectAn.setText("YOU SELECTED CHIPS" + "\n" + "Price $4");
					btnRadioButton_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
					btnRadioButton_1.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 20, SWT.BOLD));

					btnApple.setSelection(false);
					btnBananas.setSelection(false);
					btnRadioButton.setSelection(false);

					btnApple.setFont(null);
					btnApple.setForeground(null);
					btnBananas.setFont(null);
					btnBananas.setForeground(null);
					btnRadioButton.setFont(null);
					btnRadioButton.setForeground(null);

					itemSelected = true;
					itemName = btnRadioButton_1.getText();
					itemPrice = 4.00;
				} // if
				else {
					lblPleaseSelectAn
							.setText("Please finish checkout process or hit CANCEL to select a different Item");
					btnApple.setSelection(false);
				} // else

			}// mouseDown
		});
		btnRadioButton_1.setBounds(22, 127, 177, 18);
		btnRadioButton_1.setText("Chips");

		Button btnCheckout = new Button(shell, SWT.NONE);
		btnCheckout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (itemSelected == false)
					lblPleaseSelectAn.setText("YOU MUST SELECT AN ITEM FIRST. SELECT AN ITEM TO VIEW THE PRICE");
				else {
					atCheckout = true;
					lblPleaseSelectAn.setText("You have selected " + itemName + " Please pay in cash $" + itemPrice);
				} // else

			}// mouseDown
		});
		btnCheckout.setBounds(44, 248, 94, 27);
		btnCheckout.setText("Checkout");

		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				itemSelected = false;
				itemName = "";
				itemPrice = 0;
				atCheckout = false;
				amountPaid = 0;

				btnApple.setSelection(false);
				btnBananas.setSelection(false);
				btnRadioButton.setSelection(false);
				btnRadioButton_1.setSelection(false);

				lblPleaseSelectAn.setText("Please Select an Item to view price");

				btnApple.setFont(null);
				btnApple.setForeground(null);
				btnBananas.setFont(null);
				btnBananas.setForeground(null);
				btnRadioButton.setFont(null);
				btnRadioButton.setForeground(null);
				btnRadioButton_1.setFont(null);
				btnRadioButton_1.setForeground(null);

				lblDispenser.setText("");
				lblAmountPaidTxt.setText("");
				lblChangeAmountTxt.setText("");
			}
		});
		btnCancel.setBounds(174, 248, 94, 27);
		btnCancel.setText("Cancel");

		lblAmountPaidTxt.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblAmountPaidTxt.setBounds(369, 180, 59, 14);
		lblAmountPaidTxt.setText(" $0.00");

		lblAmountPaid.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 11, SWT.BOLD));
		lblAmountPaid.setBounds(359, 160, 151, 14);
		lblAmountPaid.setText("Amount Paid 💵 ");

		Button btnPenny = new Button(shell, SWT.NONE);
		btnPenny.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {

				if (atCheckout) {
					double num = amountPaid + 0.01;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnPenny.setBounds(359, 210, 69, 27);
		btnPenny.setText("$0.01");

		Button btnNickel = new Button(shell, SWT.NONE);
		btnNickel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (atCheckout) {
					double num = amountPaid + 0.05;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnNickel.setBounds(359, 248, 69, 27);
		btnNickel.setText("$0.05");

		Button btnDime = new Button(shell, SWT.NONE);
		btnDime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (atCheckout) {
					double num = amountPaid + 0.10;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnDime.setBounds(359, 282, 69, 27);
		btnDime.setText("$0.10");

		Button btnQuarter = new Button(shell, SWT.NONE);
		btnQuarter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (atCheckout) {
					double num = amountPaid + 0.25;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnQuarter.setBounds(359, 315, 69, 27);
		btnQuarter.setText("$0.25");

		Button btnOne = new Button(shell, SWT.NONE);
		btnOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (atCheckout) {
					double num = amountPaid + 1.00;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnOne.setBounds(435, 210, 69, 27);
		btnOne.setText("$1");

		Button btnFive = new Button(shell, SWT.NONE);
		btnFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (atCheckout) {
					double num = amountPaid + 5.00;
					if (num >= itemPrice) {
						lblAmountPaidTxt.setText("$" + num);
						lblDispenser.setText(itemName + " DISPENSED");
						amountPaid = num;
						double difference = amountPaid - itemPrice;
						lblChangeAmountTxt.setText("$" + difference);
						
					} // if
					else {
						lblAmountPaidTxt.setText("$" + num);
						amountPaid = num;
					} // else
				} // if
				else {
				} // else
			}
		});
		btnFive.setBounds(434, 248, 69, 27);
		btnFive.setText("$5");

		Button btnEnter = new Button(shell, SWT.NONE);
		btnEnter.setBounds(434, 282, 69, 57);
		btnEnter.setText("ENTER");

		lblDispenser.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblDispenser.setBounds(34, 390, 297, 34);

		lblChange.setBounds(359, 363, 77, 19);
		lblChange.setText("Change 💰 ");

		lblChangeAmountTxt.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblChangeAmountTxt.setBounds(359, 390, 69, 14);
		lblChangeAmountTxt.setText("$0.00");

	}// createcontent
}
