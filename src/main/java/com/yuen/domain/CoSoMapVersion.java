package com.yuen.domain;
// Generated Jan 30, 2018 8:45:22 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CoSoMapVersion generated by hbm2java
 */
@Entity
@Table(name = "co_so_map_version", catalog = "mycontact")
public class CoSoMapVersion implements java.io.Serializable {

	private Integer coSoMapVersionId;
	private CourseOutcomeVersion courseOutcomeVersion;
	private StudentOutcomeVersion studentOutcomeVersion;
	private int coSoMapVersionCode;
	private Date coSoMapVersionDate;
	private boolean coSoMapVersionIsused;
	private Set<CoSoMap> coSoMaps = new HashSet<CoSoMap>(0);

	public CoSoMapVersion() {
	}

	public CoSoMapVersion(int coSoMapVersionCode, Date coSoMapVersionDate, boolean coSoMapVersionIsused) {
		this.coSoMapVersionCode = coSoMapVersionCode;
		this.coSoMapVersionDate = coSoMapVersionDate;
		this.coSoMapVersionIsused = coSoMapVersionIsused;
	}

	public CoSoMapVersion(CourseOutcomeVersion courseOutcomeVersion, StudentOutcomeVersion studentOutcomeVersion,
			int coSoMapVersionCode, Date coSoMapVersionDate, boolean coSoMapVersionIsused, Set<CoSoMap> coSoMaps) {
		this.courseOutcomeVersion = courseOutcomeVersion;
		this.studentOutcomeVersion = studentOutcomeVersion;
		this.coSoMapVersionCode = coSoMapVersionCode;
		this.coSoMapVersionDate = coSoMapVersionDate;
		this.coSoMapVersionIsused = coSoMapVersionIsused;
		this.coSoMaps = coSoMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "co_so_map_version_id", unique = true, nullable = false)
	public Integer getCoSoMapVersionId() {
		return this.coSoMapVersionId;
	}

	public void setCoSoMapVersionId(Integer coSoMapVersionId) {
		this.coSoMapVersionId = coSoMapVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_outcome_version_id")
	public CourseOutcomeVersion getCourseOutcomeVersion() {
		return this.courseOutcomeVersion;
	}

	public void setCourseOutcomeVersion(CourseOutcomeVersion courseOutcomeVersion) {
		this.courseOutcomeVersion = courseOutcomeVersion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_outcome_version_id")
	public StudentOutcomeVersion getStudentOutcomeVersion() {
		return this.studentOutcomeVersion;
	}

	public void setStudentOutcomeVersion(StudentOutcomeVersion studentOutcomeVersion) {
		this.studentOutcomeVersion = studentOutcomeVersion;
	}

	@Column(name = "co_so_map_version_code", nullable = false)
	public int getCoSoMapVersionCode() {
		return this.coSoMapVersionCode;
	}

	public void setCoSoMapVersionCode(int coSoMapVersionCode) {
		this.coSoMapVersionCode = coSoMapVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "co_so_map_version_date", nullable = false, length = 10)
	public Date getCoSoMapVersionDate() {
		return this.coSoMapVersionDate;
	}

	public void setCoSoMapVersionDate(Date coSoMapVersionDate) {
		this.coSoMapVersionDate = coSoMapVersionDate;
	}

	@Column(name = "co_so_map_version_isused", nullable = false)
	public boolean isCoSoMapVersionIsused() {
		return this.coSoMapVersionIsused;
	}

	public void setCoSoMapVersionIsused(boolean coSoMapVersionIsused) {
		this.coSoMapVersionIsused = coSoMapVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coSoMapVersion")
	public Set<CoSoMap> getCoSoMaps() {
		return this.coSoMaps;
	}

	public void setCoSoMaps(Set<CoSoMap> coSoMaps) {
		this.coSoMaps = coSoMaps;
	}

}