package com.amalitech.bankaccount.menu;

import java.util.logging.Logger;

public class Menu {


    public void intro() {

        String introFormattedStr = """
                --------------------------------------------
                --------------------------------------------
                |                                          |
                
                |     BANK ACCOUNT MANAGEMENT - MAIN MENU  |                                 |
                --------------------------------------------
                --------------------------------------------
                
                1. Create Account
                2. View Account
                3. Process Transaction
                4. View Transaction History
                5. Exit
                """;

//        Logger logger = Logger.

        System.out.println(introFormattedStr);

    }
}
