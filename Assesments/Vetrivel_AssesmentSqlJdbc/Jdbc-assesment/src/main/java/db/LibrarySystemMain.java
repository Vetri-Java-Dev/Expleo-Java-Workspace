package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibrarySystemMain {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        Connection con;
        
        Statement statement=null;
        ResultSet resultSet=null;

        try {
            con = DbConnection.getConnection();
            
            statement = con.createStatement();

            while (true) {

                System.out.println("\nLibrary system : ");
                System.out.println("1.Retrieve All Books.");
                System.out.println("2.Update fine for overdue members.");
                System.out.println("3.Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        String query = "select * from books";
                        resultSet=statement.executeQuery(query);

                        System.out.println("\nBooks :");
                        while (resultSet.next()) {
                            System.out.println(
                            		 resultSet.getInt("book_id") + " | " +
                            		 resultSet.getString("title") + " | " +
                            		 resultSet.getString("author") + " | " +
                            		 resultSet.getInt("category_id")
                            );
                        }
                        break;

                    case 2:
                    	
                    	String updateQuery = "update fines set fine_amount = 500 " +
                    	        "where payment_status = 'Overdue'";

                        int rows = statement.executeUpdate(updateQuery);
                        
                        if(rows>0) {
                        	
                        	System.out.println(rows+" records updated.");
                        	String selectQuery = "select member_id, payment_status, fine_amount " +
                                    "from fines where payment_status = 'Overdue'";

                            resultSet =statement.executeQuery(selectQuery);

                            System.out.println("\nUpdated members : ");
                            
                            while (resultSet.next()) {
                            	
                            	System.out.println(
                                        "Member ID : " + resultSet.getInt("member_id")+" | "+
                                        resultSet.getString("payment_status")+" | Fine : "+
                                        resultSet.getDouble("fine_amount")
                                );
                            }
                        }
                        else {
                        	System.out.print("\nNo records has payment status is overdue.\n");
                        }

                        
                        break;

                    case 3:
                        System.out.println("Thank you !!!");
                        
                        // Closing resource
                        statement.close();
                        con.close();
                        sc.close();
                        
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}