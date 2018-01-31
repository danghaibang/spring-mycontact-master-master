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
 * TakersolutionComponent generated by hbm2java
 */
@Entity
@Table(name = "takersolution_component", catalog = "mycontact")
public class TakersolutionComponent implements java.io.Serializable {

	private Integer takersolutionComponentId;
	private QuestionItem questionItemByItemId;
	private QuestionItem questionItemByQueItemId;
	private TakerSolution takerSolution;

	public TakersolutionComponent() {
	}

	public TakersolutionComponent(QuestionItem questionItemByItemId, QuestionItem questionItemByQueItemId,
			TakerSolution takerSolution) {
		this.questionItemByItemId = questionItemByItemId;
		this.questionItemByQueItemId = questionItemByQueItemId;
		this.takerSolution = takerSolution;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "takersolution_component_id", unique = true, nullable = false)
	public Integer getTakersolutionComponentId() {
		return this.takersolutionComponentId;
	}

	public void setTakersolutionComponentId(Integer takersolutionComponentId) {
		this.takersolutionComponentId = takersolutionComponentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	public QuestionItem getQuestionItemByItemId() {
		return this.questionItemByItemId;
	}

	public void setQuestionItemByItemId(QuestionItem questionItemByItemId) {
		this.questionItemByItemId = questionItemByItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "que_item_id")
	public QuestionItem getQuestionItemByQueItemId() {
		return this.questionItemByQueItemId;
	}

	public void setQuestionItemByQueItemId(QuestionItem questionItemByQueItemId) {
		this.questionItemByQueItemId = questionItemByQueItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taker_solution_id")
	public TakerSolution getTakerSolution() {
		return this.takerSolution;
	}

	public void setTakerSolution(TakerSolution takerSolution) {
		this.takerSolution = takerSolution;
	}

}