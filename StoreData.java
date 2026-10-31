/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gui;

import javax.swing.table.DefaultTableModel;

public class StoreData {

    public static DefaultTableModel sales = new DefaultTableModel(
        new Object[]{"ID", "Item", "Quantity", "Amount"}, 0
    );

    public static DefaultTableModel utang = new DefaultTableModel(
        new Object[]{"ID", "Customer Lastname", "Customer Firstname",
            "Contact No.", "Items", "Amount", "Amount Paid",
            "Due Date", "Status"}, 0
    );

    public static DefaultTableModel utangReports = new DefaultTableModel(
        new Object[]{"ID", "Customer Lastname", "Customer Firstname",
            "Contact No.", "Item", "Amount", "Amount Paid",
            "Due Date", "Status"}, 0
    );

    public static DefaultTableModel voidedUtang = new DefaultTableModel(
        new Object[]{"ID", "Customer Lastname", "Customer Firstname",
            "Contact No.", "Item", "Amount", "Amount Paid",
            "Due Date", "Status"}, 0
    );

    public static int saleID = 1;
    public static int utangID = 1;

    public static void refreshTables() {
        // Update the displayed data in each frame.
        // Each frame should set its JTable model to the shared model.
    }
}
