package com.google;
import java.util.List;
import java.util.*;  

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  static boolean isPlaying = false;
  public Video newVid;
  public String currentId;
  public Video currentVid;
  
  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

//implemented
  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

//partially implemented. Sorting required
  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:"); 
    List<Video> videos = videoLibrary.getVideos();
    for (Video vid : videos) {
    System.out.println(vid.getTitle() + "(" + vid.getVideoId() + ")" + vid.getTags());
    }
  }

//fully implemented
  public void playVideo(String videoId) {
  newVid = videoLibrary.getVideo(videoId);
  currentVid = videoLibrary.getVideo(currentId);
  //can be change to if newVid
  if (videoLibrary.getVideo(videoId) == null) {
   System.out.println("Cannot play video: Video does not exist");
   } else if (isPlaying == false) {
   System.out.println("Playing video: " + newVid.getTitle());
   isPlaying = true;
   currentId = newVid.getVideoId();
  } else if (isPlaying == true) {
	 System.out.println("Stopping video: " + currentVid.getTitle());
     System.out.println("Playing video: " + newVid.getTitle());
        isPlaying = true;
           currentId = newVid.getVideoId();
  }
  }

//fully implemented
  public void stopVideo() {
    currentVid = videoLibrary.getVideo(currentId);
       currentId = newVid.getVideoId();
  if (isPlaying == false) {
   System.out.println("Cannot stop video: No video is currently playing");
  } else if (isPlaying = true) {
  System.out.println("Stopping video: " + currentVid.getTitle());
  isPlaying = false;
  } 
  }

//partially implemented
  public void playRandomVideo() {
      List<Video> videos = videoLibrary.getVideos();
      //Video random = random.getRandomElement(videos);
  currentVid = videoLibrary.getVideo(currentId);
       currentId = newVid.getVideoId();
  if (isPlaying == false) {
  System.out.println("Playing video: ");
  isPlaying = true;
  currentId = newVid.getVideoId();
  } else if (isPlaying == true) {
    System.out.println("Stopping video: " + currentVid.getTitle());
    System.out.println("Playing video: ");
    isPlaying = true; //is this necessary?
           currentId = newVid.getVideoId();
  }
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}