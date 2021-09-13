package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputDay = new Scanner(System.in);
        System.out.println("Please enter Day of the month");
        int Day = inputDay.nextInt();
        if (Day<1 || Day >31){
            System.out.println("Please enter correct Day of the month");
            System.exit(0);
        }
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Please enter Month of the Year");
        int Month = inputMonth.nextInt();
        if (Month<1 || Month >12){
            System.out.println("Please enter correct Day of the month");
            System.exit(0);
        }
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int Year = inputYear.nextInt();
        if (Year<0 || Year >3000){
            System.out.println("Wrong data. Please rerun the Program and enter correct Year");
            System.exit(0);
        }
        Scanner inputDateFormat = new Scanner(System.in);
        System.out.println("What format you would prefer: 1 - YYYY/MM/DD, 2- YYYY.MM.DD");
        int ChosenDataType = inputDateFormat.nextInt();
        if (ChosenDataType == 1)
            System.out.println(Day + "/" + Month + "/" + Year);
        else if (ChosenDataType == 2)
            System.out.println(Day + "." + Month + "." + Year);
    }
    }
