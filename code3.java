class Area
{
      public static void main(String[]args)
       {
            int length =5;
            int breadth =4;
            int areaOfRect= length*breadth;
            int num =length+breadth;
            int permtOfRect =2*num; 
            System.out.println(areaOfRect);
            System.out.println(permtOfRect);

           if(areaOfRect>permtOfRect)
            {
                  System.out.println("Area Of Rectangle is greater than Perimeter Of Rectangle");
            }


                  }
}