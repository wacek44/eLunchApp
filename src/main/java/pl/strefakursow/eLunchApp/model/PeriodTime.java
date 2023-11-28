package pl.strefakursow.eLunchApp.model;

import jakarta.persistence.Embeddable;

import jakarta.annotation.Nullable;
import java.time.LocalTime;

@Embeddable
public class PeriodTime {

	@Nullable
	private LocalTime begin;

	@Nullable
	private LocalTime end;


	@Nullable
	public LocalTime getBegin() {
		return begin;
	}

	public void setBegin(@Nullable LocalTime begin) {
		this.begin = begin;
	}

	@Nullable
	public LocalTime getEnd() {
		return end;
	}

	public void setEnd(@Nullable LocalTime end) {
		this.end = end;
	}
}
