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
 * CourseReviewerDecision generated by hbm2java
 */
@Entity
@Table(name = "course_reviewer_decision", catalog = "mycontact")
public class CourseReviewerDecision implements java.io.Serializable {

	private Integer courseReviewerDecisionId;
	private String courseReviewerDecisionCode;
	private String courseReviewerDecisionDesc;
	private Set<ContentComment> contentComments = new HashSet<ContentComment>(0);
	private Set<CourseComment> courseComments = new HashSet<CourseComment>(0);

	public CourseReviewerDecision() {
	}

	public CourseReviewerDecision(String courseReviewerDecisionCode, String courseReviewerDecisionDesc) {
		this.courseReviewerDecisionCode = courseReviewerDecisionCode;
		this.courseReviewerDecisionDesc = courseReviewerDecisionDesc;
	}

	public CourseReviewerDecision(String courseReviewerDecisionCode, String courseReviewerDecisionDesc,
			Set<ContentComment> contentComments, Set<CourseComment> courseComments) {
		this.courseReviewerDecisionCode = courseReviewerDecisionCode;
		this.courseReviewerDecisionDesc = courseReviewerDecisionDesc;
		this.contentComments = contentComments;
		this.courseComments = courseComments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_reviewer_decision_id", unique = true, nullable = false)
	public Integer getCourseReviewerDecisionId() {
		return this.courseReviewerDecisionId;
	}

	public void setCourseReviewerDecisionId(Integer courseReviewerDecisionId) {
		this.courseReviewerDecisionId = courseReviewerDecisionId;
	}

	@Column(name = "course_reviewer_decision_code", nullable = false, length = 100)
	public String getCourseReviewerDecisionCode() {
		return this.courseReviewerDecisionCode;
	}

	public void setCourseReviewerDecisionCode(String courseReviewerDecisionCode) {
		this.courseReviewerDecisionCode = courseReviewerDecisionCode;
	}

	@Column(name = "course_reviewer_decision_desc", nullable = false, length = 65535)
	public String getCourseReviewerDecisionDesc() {
		return this.courseReviewerDecisionDesc;
	}

	public void setCourseReviewerDecisionDesc(String courseReviewerDecisionDesc) {
		this.courseReviewerDecisionDesc = courseReviewerDecisionDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseReviewerDecision")
	public Set<ContentComment> getContentComments() {
		return this.contentComments;
	}

	public void setContentComments(Set<ContentComment> contentComments) {
		this.contentComments = contentComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseReviewerDecision")
	public Set<CourseComment> getCourseComments() {
		return this.courseComments;
	}

	public void setCourseComments(Set<CourseComment> courseComments) {
		this.courseComments = courseComments;
	}

}
