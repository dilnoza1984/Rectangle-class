class Main {
  public static void main(String[] args) {
     Rectangle rectangle1 = new Rectangle();
    rectangle1.width =4;
    rectangle1.heigth =40;
     System.out.println("REctangle1 width"   + rectangle1.width);
     System.out.println("REctangle1 heigth"  + rectangle1.heigth);
    System.out.println("REctangle1 area"  + rectangle1.getArea());
     System.out.println("REctangle1 perimeter"  +  rectangle1.getPerimeter());
    System.out.println("--------------------------------");
   Rectangle rectangle2= new Rectangle();
      rectangle2.width =3.5;
    rectangle2.heigth =35.9;
    System.out.println("REctangle2 width"   + rectangle2.width);
     System.out.println("REctangle2 heigth"  + rectangle2.heigth);
    System.out.println("REctangle2 area"  + rectangle2.getArea());
     System.out.println("REctangle2 perimeter"  +  rectangle2.getPerimeter());
 

  
    
  }
}