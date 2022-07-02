package com.example.musify.data.dto

import com.google.gson.annotations.SerializedName

/**
 * A DTO object that contains information about a specific track
 * together with the metadata of the associated album.
 */
data class TrackDTOWithAlbumMetadata(
    val id: String,
    val name: String,
    @SerializedName("preview_url") val previewUrl: String?,
    @SerializedName("is_playable") val isPlayable: Boolean,
    val explicit: Boolean,
    @SerializedName("duration_ms") val durationInMillis: Int,
    @SerializedName("album") val albumMetadata: AlbumMetadataDTO
)
