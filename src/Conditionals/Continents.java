package Conditionals;
public class Continents {
    // Prints out a continent and the largest city in that continent
    public static void main(String[] args) {
      int continent = 4;
  
      switch(continent) {
        case 1:
          System.out.println("North America: Mexico City, Mexico");
          break;
        case 2:
          System.out.println("South America: Sao Paulo, Brazil");
          break;
        case 3:
          System.out.println("Europe: Moscow, Russia");
          break;
        case 4:
          System.out.println("Aftrica: Lagos, Nigeria");
          break;
        case 5:
          System.out.println("Antarctica: McMurdo Station, US");
          break;
        default:
          System.out.println("Undefined continent!");
      }
    }
  }