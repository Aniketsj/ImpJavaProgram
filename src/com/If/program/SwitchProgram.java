package com.If.program;

public class SwitchProgram {
    public static void main(String args[]) {
      int no = 12;
      //String no = "10";
String month = null;
      
      switch(no){
          case 1:
              month = "Jan";
              break;
              case 5:
                   month = "May";
              break;
              case 10:
                   month = "Oct";
              break;
              default:
               month = "No month";
      }
      System.out.println(month);
    }
}