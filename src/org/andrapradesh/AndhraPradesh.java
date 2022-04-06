
package org.andrapradesh;

import org.kerala.Kerala;
import org.ondia.India;
import org.tamilnadu.TamilLanguage;
//Multilevel inheritance
public class AndhraPradesh extends India{
	
	public void telugu() {
		System.out.println("AndhraPradesh");
	}
	
			public static void main(String[] args) {
				 AndhraPradesh a=new AndhraPradesh();

				 a.telugu();
				 
				TamilLanguage t= new TamilLanguage();
				t.tamilLanguage();
				
				Kerala k= new Kerala();

				 a.india();
				k.malayalam();
				
			}
}

	
    
	
	
	
	
	



	