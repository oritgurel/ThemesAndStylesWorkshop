package com.workshop7.network.serviceModel

data class Response(
	val pagination: Pagination? = null,
	val data: List<DataItem>? = null
)

data class DataItem(
	val image: Any? = null,
	val country: String? = null,
	val author: String? = null,
	val description: String? = null,
	val language: String? = null,
	val source: String? = null,
	val title: String? = null,
	val category: String? = null,
	val publishedAt: String? = null,
	val url: String? = null
)

data class Pagination(
	val total: Int? = null,
	val offset: Int? = null,
	val limit: Int? = null,
	val count: Int? = null
)

