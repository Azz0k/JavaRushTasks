package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            for (int i = 0; i <users.size() ; i++) {
                outputStream.write(users.get(i).getFirstName().getBytes());
                outputStream.write("\n".getBytes());
                outputStream.write(users.get(i).getLastName().getBytes());
                outputStream.write("\n".getBytes());
                outputStream.write(users.get(i).getCountry().getDisplayName().getBytes());
                outputStream.write("\n".getBytes());
                outputStream.write(String.valueOf(users.get(i).getBirthDate().getTime()).getBytes());
                outputStream.write("\n".getBytes());
                if (users.get(i).isMale())
                    outputStream.write("true".getBytes());
                else
                    outputStream.write("false".getBytes());
                outputStream.write("\n".getBytes());
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready())
            {
                User user=new User();
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                String line=reader.readLine();
                if (line.equals("Ukraine"))
                    user.setCountry(User.Country.UKRAINE);
                else
                    if(line.equals("Russia"))
                        user.setCountry(User.Country.RUSSIA);
                    else
                        user.setCountry(User.Country.OTHER);
                Date date=    new Date();
                date.setTime(Long.parseLong(reader.readLine()));
                user.setBirthDate(date);
                line=reader.readLine();
                if (line.equals("true"))
                    user.setMale(true);
                else
                    user.setMale(false);
                users.add(user);

            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
