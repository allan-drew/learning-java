package br.com.cursojava.i01streams.dominio;

import java.util.Objects;

public class MusicArtists {

    private String artistName;
    private Integer monthlyListeners;

    public MusicArtists(String artistName, Integer monthlyListeners) {
        this.artistName = artistName;
        this.monthlyListeners = monthlyListeners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicArtists that = (MusicArtists) o;
        return Objects.equals(artistName, that.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName);
    }

    @Override
    public String toString() {
        return "\n" +
                "   MusicArtists {" + "\n" +
                "   artistName='" + artistName + "\n" +
                "   monthlyListeners=" + monthlyListeners + "\n" +
                '}';
    }

    public String getArtistName() {
        return artistName;
    }

    public Integer getMonthlyListeners() {
        return monthlyListeners;
    }



}

