/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempuratureconvertergui;


public class TempConvertService {
    
    double fahreinheit;
    double celsius;
    String celsiusString;
    String fahreinheitString;
    
    public String fahreinheitToCelsius(String f) throws IllegalArgumentException{
        if (f == null || f.isEmpty()){
            throw new NullPointerException();
        }
        fahreinheit = Double.valueOf(f.trim());
        
        celsius = ((fahreinheit - 32) * 0.5556);
        celsiusString = Double.toString(celsius);
        return celsiusString;
    }
   
    public String celsiusToFahreinheit(String c) {
        celsius = Double.valueOf(c.trim());
        fahreinheit = (celsius / 0.5556) + 32;
        fahreinheitString = Double.toString(fahreinheit);
        return fahreinheitString;
    }
    
}
