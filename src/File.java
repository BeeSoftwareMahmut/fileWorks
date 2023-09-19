import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

class MyFile {

    String FileUrl;
    String FileName;

    MyFile(String FileUrl) {
        this.FileUrl = FileUrl;
    }

   


    public void readFile() {
        try {
            BufferedReader okuyucu = new BufferedReader(new FileReader(this.FileUrl));

            String line = okuyucu.readLine();

            while (line != null) {
                System.out.println(line);
                line = okuyucu.readLine();
            }

            okuyucu.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {

        try {
            BufferedWriter yazici = new BufferedWriter(new FileWriter(this.FileUrl, true));
            yazici.write("Bu sonradan eklendi");
            yazici.newLine();
            yazici.write("Bu da sonradan eklendi");
            yazici.newLine();
            yazici.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void createFile(String FileName){
          this.FileName=FileName;
        
          File dosya=new File(this.FileName);

          try {
            //create File
            if(dosya.createNewFile()){
                System.out.println("Yeni dosya oluşturuldu");
            }
            
            else{
                System.out.println("Dosya zaten Var");
            }

          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    public void deleteFile(String FileName){
          this.FileName=FileName;
        
          File dosya=new File(this.FileName);

          
            //delete File
            if(dosya.delete()){
                System.out.println(" dosya silindi");
            }
            
            else{
                System.out.println("Dosya silinemedi");
            }

          
    }

}
