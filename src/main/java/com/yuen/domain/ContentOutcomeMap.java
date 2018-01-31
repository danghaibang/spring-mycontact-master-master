package com.yuen.domain;
// Generated Jan 30, 2018 8:45:22 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContentOutcomeMap generated by hbm2java
 */
@Entity
@Table(name = "content_outcome_map", catalog = "mycontact")
public class ContentOutcomeMap implements java.io.Serializable {

	private Integer contentOutcomeMapId;
	private CourseContent courseContent;
	private CourseOutcome courseOutcome;
	private String contentOutcomeMapDesc;

	public ContentOutcomeMap() {
	}

	public ContentOutcomeMap(CourseContent courseContent, CourseOutcome courseOutcome, String contentOutcomeMapDesc) {
		this.courseContent = courseContent;
		this.courseOutcome = courseOutcome;
		this.contentOutcomeMapDesc = contentOutcomeMapDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "content_outcome_map_id", unique = true, nullable = false)
	public Integer getContentOutcomeMapId() {
		return this.contentOutcomeMapId;
	}

	public void setContentOutcomeMapId(Integer contentOutcomeMapId) {
		this.contentOutcomeMapId = contentOutcomeMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_content_id")
	public CourseContent getCourseContent() {
		return this.courseContent;
	}

	public void setCourseContent(CourseContent courseContent) {
		this.courseContent = courseContent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "co_id")
	public CourseOutcome getCourseOutcome() {
		return this.courseOutcome;
	}

	public void setCourseOutcome(CourseOutcome courseOutcome) {
		this.courseOutcome = courseOutcome;
	}

	@Column(name = "content_outcome_map_desc", length = 65535)
	public String getContentOutcomeMapDesc() {
		return this.contentOutcomeMapDesc;
	}

	public void setContentOutcomeMapDesc(String contentOutcomeMapDesc) {
		this.contentOutcomeMapDesc = contentOutcomeMapDesc;
	}

}
