/* CodingNomads (C)2024 */
package com.codingnomads.springdata.example.mybatis.mapperslesson;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyBatisDemoApplication {

    /* Before running this app, be sure to:

       * create a new empty schema in the mysql database named "mybatis"

       * execute the SQL found "songs_table.sql" on the mybatis schema

       * update the "spring.datasource.url" property in your application.properties file to
         jdbc:mysql://localhost:3306/mybatis?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC

    */

    public static void main(String[] args) {
        SpringApplication.run(MyBatisDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadInitialData(SongMapper songMapper) {
        return (args) -> {
            Song song1 = new Song();
            song1.setName("Minnesota, WI");
            song1.setAlbum_name("Bon Iver");
            song1.setArtist_name("Bon Iver");
            song1.setSong_length(232);

            Song song2 = new Song();
            song2.setName("Post Humorous");
            song2.setAlbum_name("Orca");
            song2.setArtist_name("Gus Dapperton");
            song2.setSong_length(279);

//            Song song4 = new Song();
//            song1.setName("Colorado, Kenya");
//            song1.setAlbum_name("Bon Iver");
//            song1.setArtist_name("Bon Iver");
//            song1.setSong_length(200);

            songMapper.insertNewSong(song1);
            songMapper.insertNewSong(song2);
//            songMapper.insertNewSong(song4);

            Song song3 = songMapper.getSongById(1L);

            List<Song> longSongs = songMapper.getSongsWithLengthGreaterThan(250);
            longSongs.forEach(System.out::println);
//
//            List<Song> albumSongs = songMapper.getSongsByAlbumName("Orca");
//            albumSongs.forEach(System.out::println);


            System.out.println(song3.toString());

            songMapper.deleteSongById(1L);
            songMapper.deleteSongById(2L);
            songMapper.deleteSongById(3L);
            songMapper.deleteSongById(4L);
            songMapper.deleteSongById(5L);
            songMapper.deleteSongById(6L);
        };
    }
}
