/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fiap.fase06.grupo10.apipedido.broker.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PedidoKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6480113000140644586L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PedidoKey\",\"namespace\":\"com.fiap.fase06.grupo10.apipedido.broker.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"clientId\",\"type\":\"string\"},{\"name\":\"restauranteId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PedidoKey> ENCODER =
      new BinaryMessageEncoder<PedidoKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PedidoKey> DECODER =
      new BinaryMessageDecoder<PedidoKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PedidoKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PedidoKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PedidoKey>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PedidoKey to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PedidoKey from a ByteBuffer. */
  public static PedidoKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence clientId;
  @Deprecated public java.lang.CharSequence restauranteId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PedidoKey() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param clientId The new value for clientId
   * @param restauranteId The new value for restauranteId
   */
  public PedidoKey(java.lang.CharSequence id, java.lang.CharSequence clientId, java.lang.CharSequence restauranteId) {
    this.id = id;
    this.clientId = clientId;
    this.restauranteId = restauranteId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return clientId;
    case 2: return restauranteId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: clientId = (java.lang.CharSequence)value$; break;
    case 2: restauranteId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'clientId' field.
   * @return The value of the 'clientId' field.
   */
  public java.lang.CharSequence getClientId() {
    return clientId;
  }

  /**
   * Sets the value of the 'clientId' field.
   * @param value the value to set.
   */
  public void setClientId(java.lang.CharSequence value) {
    this.clientId = value;
  }

  /**
   * Gets the value of the 'restauranteId' field.
   * @return The value of the 'restauranteId' field.
   */
  public java.lang.CharSequence getRestauranteId() {
    return restauranteId;
  }

  /**
   * Sets the value of the 'restauranteId' field.
   * @param value the value to set.
   */
  public void setRestauranteId(java.lang.CharSequence value) {
    this.restauranteId = value;
  }

  /**
   * Creates a new PedidoKey RecordBuilder.
   * @return A new PedidoKey RecordBuilder
   */
  public static com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder newBuilder() {
    return new com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder();
  }

  /**
   * Creates a new PedidoKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PedidoKey RecordBuilder
   */
  public static com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder newBuilder(com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder other) {
    return new com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder(other);
  }

  /**
   * Creates a new PedidoKey RecordBuilder by copying an existing PedidoKey instance.
   * @param other The existing instance to copy.
   * @return A new PedidoKey RecordBuilder
   */
  public static com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder newBuilder(com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey other) {
    return new com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder(other);
  }

  /**
   * RecordBuilder for PedidoKey instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PedidoKey>
    implements org.apache.avro.data.RecordBuilder<PedidoKey> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence clientId;
    private java.lang.CharSequence restauranteId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientId)) {
        this.clientId = data().deepCopy(fields()[1].schema(), other.clientId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.restauranteId)) {
        this.restauranteId = data().deepCopy(fields()[2].schema(), other.restauranteId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PedidoKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientId)) {
        this.clientId = data().deepCopy(fields()[1].schema(), other.clientId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.restauranteId)) {
        this.restauranteId = data().deepCopy(fields()[2].schema(), other.restauranteId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientId' field.
      * @return The value.
      */
    public java.lang.CharSequence getClientId() {
      return clientId;
    }

    /**
      * Sets the value of the 'clientId' field.
      * @param value The value of 'clientId'.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder setClientId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.clientId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'clientId' field has been set.
      * @return True if the 'clientId' field has been set, false otherwise.
      */
    public boolean hasClientId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'clientId' field.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder clearClientId() {
      clientId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'restauranteId' field.
      * @return The value.
      */
    public java.lang.CharSequence getRestauranteId() {
      return restauranteId;
    }

    /**
      * Sets the value of the 'restauranteId' field.
      * @param value The value of 'restauranteId'.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder setRestauranteId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.restauranteId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'restauranteId' field has been set.
      * @return True if the 'restauranteId' field has been set, false otherwise.
      */
    public boolean hasRestauranteId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'restauranteId' field.
      * @return This builder.
      */
    public com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey.Builder clearRestauranteId() {
      restauranteId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PedidoKey build() {
      try {
        PedidoKey record = new PedidoKey();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.clientId = fieldSetFlags()[1] ? this.clientId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.restauranteId = fieldSetFlags()[2] ? this.restauranteId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PedidoKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<PedidoKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PedidoKey>
    READER$ = (org.apache.avro.io.DatumReader<PedidoKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
