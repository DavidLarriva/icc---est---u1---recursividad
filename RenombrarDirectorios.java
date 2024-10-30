
import java.io.File;
public class RenombrarDirectorios {
    
    public void renombrarDirectorios(String path) {
        //Validamos que el path sea un directorio
        File  directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La rita path no es un directorio xd");
            return;
            
        }
         //ACA vamos a cambiar los nombres
        //System.out.println("La ruta path es valida");
        renombrarDirectoriosInternos(directorio);


    }
    public void renombrarDirectoriosInternos(File directorio) {
        // Listar todos los archivos y/o carpetas hijas
        File[] archivos = directorio.listFiles();
        if  (archivos == null) {
            return;
        }
    
        for(File directorioArchivo :  archivos) {
            if(directorioArchivo.isDirectory()) {
                // Renombrar el directorio
                String nombreCarpeta = directorioArchivo.getName();
                String nombreNuevo = "nuevo-" + nombreCarpeta;
                
                

        }



    }
}
}
