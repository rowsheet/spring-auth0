export USER=hchsxiuqimjfmf
export PASS=ada12c8b3c68502314236cf2ba22378469fa04dcd2cd94ba165ca1cd37d8b57a
export HOST=ec2-107-21-214-101.compute-1.amazonaws.com
export PORT=5432
export NAME=d4b0n1fqpr4ptr
export PASS=ada12c8b3c68502314236cf2ba22378469fa04dcd2cd94ba165ca1cd37d8b57a
echo $PASS
psql \
    $NAME \
    --host=$HOST \
    --username=$USER \
