package com.responseClasses

data class NewGameResponse(val gameId: String,
                           val playerId: String,
                           val turnBoard: Boolean,
                           val board: BoardToSend
)