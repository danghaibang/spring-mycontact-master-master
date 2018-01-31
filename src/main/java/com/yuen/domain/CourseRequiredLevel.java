package com.yuen.domain;
// Generated Jan 30, 2018 8:45:22 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CourseRequiredLevel generated by hbm2java
 */
@Entity
@Table(name = "course_required_level", catalog = "mycontact")
public class CourseRequiredLevel implements java.io.Serializable {

	private Integer courseRequiredLevelId;
	private String courseRequiredLevelCode;
	private String courseRequiredLevelDesc;
	private Set<ProgramCourseMapping> programCourseMappings = new HashSet<ProgramCourseMapping>(0);

	public CourseRequiredLevel() {
	}

	public CourseRequiredLevel(String courseRequiredLevelCode, String courseRequiredLevelDesc) {
		this.courseRequiredLevelCode = courseRequiredLevelCode;
		this.courseRequiredLevelDesc = courseRequiredLevelDesc;
	}

	public CourseRequiredLevel(String courseRequiredLevelCode, String courseRequiredLevelDesc,
			Set<ProgramCourseMapping> programCourseMappings) {
		this.courseRequiredLevelCode = courseRequiredLevelCode;
		this.courseRequiredLevelDesc = courseRequiredLevelDesc;
		this.programCourseMappings = programCourseMappings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_required_level_id", unique = true, nullable = false)
	public Integer getCourseRequiredLevelId() {
		return this.courseRequiredLevelId;
	}

	public void setCourseRequiredLevelId(Integer courseRequiredLevelId) {
		this.courseRequiredLevelId = courseRequiredLevelId;
	}

	@Column(name = "course_required_level_code", nullable = false, length = 100)
	public String getCourseRequiredLevelCode() {
		return this.courseRequiredLevelCode;
	}

	public void setCourseRequiredLevelCode(String courseRequiredLevelCode) {
		this.courseRequiredLevelCode = courseRequiredLevelCode;
	}

	@Column(name = "course_required_level_desc", nullable = false, length = 65535)
	public String getCourseRequiredLevelDesc() {
		return this.courseRequiredLevelDesc;
	}

	public void setCourseRequiredLevelDesc(String courseRequiredLevelDesc) {
		this.courseRequiredLevelDesc = courseRequiredLevelDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseRequiredLevel")
	public Set<ProgramCourseMapping> getProgramCourseMappings() {
		return this.programCourseMappings;
	}

	public void setProgramCourseMappings(Set<ProgramCourseMapping> programCourseMappings) {
		this.programCourseMappings = programCourseMappings;
	}

}
