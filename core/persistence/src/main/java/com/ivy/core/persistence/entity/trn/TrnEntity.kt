package com.ivy.core.persistence.entity.trn

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ivy.data.CurrencyCode
import com.ivy.data.SyncState
import com.ivy.data.transaction.TrnPurpose
import com.ivy.data.transaction.TrnType
import java.time.Instant

@Entity(tableName = "transactions_v2")
data class TrnEntity(
    @PrimaryKey
    @ColumnInfo(name = "id", index = true)
    val id: String,

    // region Mandatory
    @ColumnInfo(name = "accountId", index = true)
    val accountId: String,
    @ColumnInfo(name = "type", index = true)
    val type: TrnType,
    @ColumnInfo(name = "amount")
    val amount: Double,
    @ColumnInfo(name = "currency")
    val currency: CurrencyCode,
    @ColumnInfo(name = "time", index = true)
    val time: Instant,
    /**
     * actual or due dateTime
     */
    @ColumnInfo(name = "timeType", index = true)
    val timeType: TrnTimeType,
    // endregion

    // region Optional
    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "description")
    val description: String?,
    @ColumnInfo(name = "categoryId", index = true)
    val categoryId: String?,
    /**
     * attachments are handled via
     * [com.ivy.core.persistence.entity.trn.attachment.TrnAttachmentEntity]
     */
    // endregion

    // region Metadata
    /**
     * transactions are linked together (batched) via
     * [TrnLinkRecordEntity]
     */

    /**
     * additional transaction metadata is stored in
     * [TrnMetadataEntity]
     */

    @ColumnInfo(name = "purpose")
    val purpose: TrnPurpose?,
    @ColumnInfo(name = "syncState", index = true)
    val syncState: SyncState,
    // endregion
)