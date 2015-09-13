/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package staticclass;


/**
 *
 * @author Chayan_pc
 */
public class StaticClass {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //----------------------static----------
      staticTest st=new staticTest();
      st.x=50;
      st.y=100;
     staticTest st1=new staticTest();
     st1.x=55;
    staticTest.y=105;
        System.out.println("st.y="+st.y+"st1.y="+st1.y);
        System.out.println("st.x="+st.x+"st1.x="+st1.x);
        
        staticTest.display();
        st.display();
        st1.display();
        
        //-------------------abstruct class---------------
        
        ChildClass abs=new ChildClass();
        abs.display();
        
        
        //=================abstruct ckass for trigonomitic,class.>trigonomitic,squre,rectangle =================
        
        Rectangle r=new Rectangle();
        r.area();
        Squre s=new Squre();
        s.area();
      
    }
}
