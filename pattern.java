/*
        Created and modified by Ajmal Shah.
        includes different patterns in one program
        with pre-difined size n (can be easily replaced).
*/
public class pattern {

    public static void main(String[] args)
    {
        int n=7;
        //squares.
        System.out.println("#### SQUARE PATTERN ####");
        System.out.println("_________________________");
        System.out.println();
        for (int r=0;r<n;r++)
        {
                for (int c=0;c<n;c++)
                {
                        System.out.print("*  "); // prints in the same line with a space.
                }
                System.out.println();            //takes the cursor to the next line.

        }
        System.out.println();
        for (int r=0;r<n;r++)
        {

            for (int c=0;c<n;c++)
            {
                if (c == 0 || r == 0 || c == n-1 || r == n-1 )
                    System.out.print("*  ");

                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int r=0;r<n;r++)
        {
            for (int c=0;c<n;c++)
            {
                if (c == 0 || r == 0 || c == n-1 || r == n-1 || r==n/2 || c ==n/2 )
                    System.out.print("*  ");

                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int r=0;r<n;r++)
        {

            for (int c=0;c<n;c++)
            {
                if (c == 0 || r == 0 || c == n-1 || r == n-1 || r==c || r+c == n-1 )
                    System.out.print("*  ");

                 else
                {
                     System.out.print("   ");
                 }
            }
            System.out.println();
         }
        //triangle starts here.
        System.out.println();
        System.out.println("#### TRAINGLE PATTERN ####");
        System.out.println("_________________________");
        System.out.println();

        System.out.println();
        for (int r =0; r<n; r++)
        {
            for(int c =0;r>=c ;c++)
            {
                    System.out.print("*  ");

            }
            System.out.println();
        }
        System.out.println();
        for (int r =0; r<n-1; r++)
        {
            for(int c =0;r + c<= n-1 ;c++)
            {
                    System.out.print("*  ");

            }
            System.out.println();
        }
        System.out.println();
        for (int r =0; r<n-1; r++)
        {
            for(int c =0;r>=c ;c++)
            {
                System.out.print("*  ");

            }
            System.out.println();
        }

        for (int r =0; r<n; r++)
        {
            for(int c =0;r + c<= n-1 ;c++)
            {
                System.out.print("*  ");

            }
            System.out.println();
        }
        System.out.println();
        for (int r =0; r<n; r++)
        {
            for(int c =0;c<n ;c++)
            {
                if(r+c>=n-1)
                System.out.print("*  ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        System.out.println();
        for (int r =0; r<n; r++)
        {
            for(int c =0;c<n ;c++)
            {
                if(r<=c)
                    System.out.print("*  ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        System.out.println();
        for (int r =0; r<n-1; r++)
        {
            for(int c =0;c<n ;c++)
            {
                if(r+c>=n-1)
                    System.out.print("*  ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        for (int r =0; r<n; r++)
        {
            for(int c =0;c<n ;c++)
            {
                if(r<=c)
                    System.out.print("*  ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        //Piramid
        System.out.println();
        System.out.println();
        System.out.println("#### PYRAMID PATTERN ####");
        System.out.println("_________________________");
        System.out.println();

        for(int r =0; r<n; r++)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r >=c;c++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int r =n-1; r>=0; r--)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r>=c;c++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        // Rombus code starts from here.
        System.out.println();
        System.out.println();
        System.out.println("#### RHOMBUS PATTERN ####");
        System.out.println("_________________________");
        System.out.println();
        
        for(int r =0; r<n-1; r++)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r >=c;c++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int r =n-1; r>=0; r--)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r>=c;c++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println();
        for(int r =0; r<n-1; r++)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r >=c;c++)
            {
                if(c==0 || c==2*r)
                System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        for(int r =n-1; r>=0; r--)
        {
            for(int space=0; space <n-1-r; space ++)
            {
                System.out.print("   ");
            }
            for(int c=0; 2*r>=c;c++)
            {
                if(c==0 || c==2*r)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

    }

}
