package com.javaex.ex11;

public class TV {

	// 패널
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 - getter만 작성 (read only)
	public int getChannel() {

		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	// 메소드 - 일반
	public void status() {
		System.out.println("채널: " + channel + "  볼륨: " + volume + "  전원: " + power);
	}

	// 전원 키고 끄기
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else if (on == false){
			this.power = false;
		}
	}

	// 볼륨 바로 이동
	public void volume(int volume) {
		if (volume >= 0 && volume <= 100) {
			this.volume = volume;
		} else {
			this.volume = 100;
		}
	}

	// 볼륨 1씩 증감
	public void volume(boolean up) {
		if(up == true) {
			if(this.volume>=0 && this.volume <=100) {
				this.volume += 1;
			} 
		} else if(up == false) {
			if(this.volume>=0 && this.volume <=100) {
				this.volume -= 1;
			}
		}
	}
	
	// 채널 바로 이동
		public void channel(int channel) {
			if (channel >= 1 && channel <= 255) {
				this.channel = channel;
			} 
		}
		
	//채널 1씩 증감	
		public void channel(boolean up) {
			if(up == true) {
				if(this.channel>=1 && this.channel <255) {
					this.channel += 1;
				} 
			} else if(up == false) {
				if(this.channel>=1 && this.channel <=255) {
					this.channel -= 1;
				}
			}
		}
		
}
