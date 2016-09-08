//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

public class Instrumentalist implements Performer {
  public Instrumentalist() {
  }

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : " + (PI==null?"null":PI));
    instrument.play();
  }

  private String song;
  private Double PI;
  

  public Double getPI() {
	return PI;
}

public void setPI(Double pI) {
	PI = pI;
}

public void setSong(String song) { //<co id="co_injectSong"/>
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  public String screamSong() {
    return song;
  }

  private Instrument instrument;

  public void setInstrument(Instrument instrument) { //<co id="co_injectInstrument"/>
    this.instrument = instrument;
  }
  
  public Instrument getInstrument() {
	  return instrument;
  }
  
  public String selectSong() {
	  return "selectSong";
  }
}
//<end id="instrumentalist_java" />
