package bg.softuni.spotifyplaylist.model.service;

import bg.softuni.spotifyplaylist.model.entity.Song;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class UserServiceModel {

    private Long id;
    private String username;
    private String password;
    private String email;
    private List<Song> playlist;

    public UserServiceModel() {
        this.playlist = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public UserServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    public UserServiceModel setPlaylist(List<Song> playlist) {
        this.playlist = playlist;
        return this;
    }
}
